package LinkedListQuestions;

public class MergeTwoSortedList {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		ListNode listNode = new ListNode();
		ListNode headNode = listNode;// listenin başını kaybetmemek için verdik

		while (list1 != null && list2 != null) {

			if (list1.val <= list2.val) {
				headNode.next = list1;
				list1 = list1.next;

			} else {
				headNode.next = list2;
				list2 = list2.next;
			}

			headNode = headNode.next;

		}

		// Burada kalan elemanları alıyoruz
		if (list1 != null) {
			headNode.next = list1;
		} else if (list2 != null) {
			headNode.next = list2;
		}

		return listNode.next;
	}

}
