package Classes;

import java.util.ArrayList;
import java.util.List;

class myStack {

	List<Integer> list;

	public myStack() {

		list = new ArrayList<Integer>();
	}

	public boolean push(int item) {

		list.add(item);
		return true;

	}

	public int pop() {

		if (list.isEmpty()) {

			System.out.println("liste boştu liste oluşturuldu");

			return -1;
		} else {

			Integer remove = list.remove(list.size() - 1);
			System.out.println("Listenen son eleman çıkarıldı" + remove);
			return remove;
		}

	}

	public List<Integer> getList() {

		return list;

	}

	public int showLast() {

		return list.get(list.size() - 1);
	}

	public int size() {

		return list.size();

	}

	public boolean isEmpty() {

		return list.isEmpty();
	}

	public List<Integer> reverseStack() {

		List<Integer> reverseList = new ArrayList<Integer>();

		for (int i = list.size() - 1; i >= 0; i--) {

			reverseList.add(list.get(i));
		}

		return reverseList;

	}

}

public class Stack {

	public static void main(String[] args) {

		myStack example = new myStack();

		example.pop();

		example.push(10);
		example.push(20);
		example.push(30);

		example.pop();

		System.out.println("Show last=" + example.showLast());
		System.out.println("Size=" + example.size());
		System.out.println("Is empty=" + example.isEmpty());

		System.out.println(example.getList());

		System.out.println(example.reverseStack());

	}

}
