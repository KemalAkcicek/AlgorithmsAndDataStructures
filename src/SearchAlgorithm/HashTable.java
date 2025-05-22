package SearchAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class HashTable {

	List<List<HashNode>> list;

	public HashTable(int size) {

		list = new ArrayList<List<HashNode>>(size);

		// Bu şekilde herbir indexe boş bir liste ekleriz eklemezsek null olur içinde
		// gezinemeyiz
		for (int i = 0; i < size; i++) {

			list.add(new ArrayList<HashNode>());
		}
	}

	public int hashFunciton(String key) {

		int myHash = 0;
		char[] charArray = key.toCharArray();

		for (char temp : charArray) {

			myHash += temp;

		}

		return myHash % list.size();
	}

	public void setItem(String key, int value) {

		int index = hashFunciton(key);

		List<HashNode> bucket = list.get(index);

		for (HashNode temp : bucket) {

			if (temp.key.equals(key)) {

				temp.value = value;
				return;
			}
		}

		bucket.add(new HashNode(key, value));

	}

	public Integer getItem(String key) {

		int index = hashFunciton(key);

		List<HashNode> bucket = list.get(index);

		for (HashNode temp : bucket) {

			if (temp.key.equals(key)) {

				return temp.value;
			}

		}

		return null;

	}

	public void getKey() {

		List<String> getKey = new ArrayList<String>();

		for (List<HashNode> temp : list) {

			for (HashNode hashNode : temp) {

				getKey.add(hashNode.key);

			}
		}

		System.out.println(getKey);

	}

	public void printList() {

		List<String> getKey = new ArrayList<String>();

		for (List<HashNode> temp : list) {

			for (HashNode hashNode : temp) {

				String entrySet = hashNode.key + " -> " + hashNode.value;

				getKey.add(entrySet);

			}
		}

		System.out.println(getKey);

	}

}
