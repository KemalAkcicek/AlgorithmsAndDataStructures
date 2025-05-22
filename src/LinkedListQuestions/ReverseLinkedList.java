package LinkedListQuestions;

public class ReverseLinkedList {
	public ListNode reverseBetween(ListNode head, int left, int right) {

		ListNode dummy = new ListNode();
		dummy.next = head;

		ListNode leftPre = dummy;
		ListNode currentNode = head;

		// başlangıç yerinin üzerine currentNode getirdik
		for (int i = 0; i < left - 1; i++) {

			leftPre = leftPre.next;
			currentNode = currentNode.next;

		}

		ListNode subListNode = currentNode;

		ListNode preNode = null;

		for (int i = 0; i <= right - left; i++) {

			ListNode nextNode = currentNode.next;
			currentNode.next = preNode;
			preNode = currentNode;
			currentNode = nextNode;

		}

		// Join the pieces
		leftPre.next = preNode; // Burada yaptığımız işlem değişimin başladığı yere bağlamak
		subListNode.next = currentNode; // Burada yaptığımız işlem değişimin son yere bağlamak

		return dummy.next;

	}
}
