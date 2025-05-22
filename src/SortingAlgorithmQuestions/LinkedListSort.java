package SortingAlgorithmQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LinkedListSort {

	public ListNode sortList(ListNode head) {

		// space =o(n) time=o(nlogn)
		Map<Integer, List<ListNode>> countMap = new TreeMap<Integer, List<ListNode>>();

		while (head != null) {

			// Burada eğer yoksa boş bir array list oluşturur varsa ise oluşturmaz altta
			// önceki değerleri alırız
			countMap.putIfAbsent(head.val, new ArrayList<>());
			countMap.get(head.val).add(head);

			head = head.next;

		}

		ListNode dummy = new ListNode();
		ListNode current = dummy;

		for (Map.Entry<Integer, List<ListNode>> entrySet : countMap.entrySet()) {

			for (ListNode node : entrySet.getValue()) {

				current.next = node;
				current = current.next;

				node.next = null;// Önceki değerleri temizlemek için kullanılır
			}

		}

		return dummy.next;
	}

}
