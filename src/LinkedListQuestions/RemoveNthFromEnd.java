package LinkedListQuestions;

public class RemoveNthFromEnd {

	public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode currentNode = head;

		int k = 0;

		while (currentNode != null) {

			currentNode = currentNode.next;
			k++;

		}
		if (k - n == 0) {
			return head.next;
		}

		currentNode = head;

		for (int i = 1; i < k - n; i++) {

			currentNode = currentNode.next;

		}

		currentNode.next = currentNode.next.next;

		return head;

	}

	public ListNode removeNthFromEnd1(ListNode head, int n) {

		// Dummynode oluşturarak başlangıçta boş olması durumda direk olarak başlangıcı
		// veriyoruz
		ListNode dummyNode = new ListNode(0);
		dummyNode.next = head;

		ListNode slowNode = dummyNode;
		ListNode fasterNode = dummyNode;

		for (int i = 0; i <= n; i++) {

			fasterNode = fasterNode.next;

		}

		while (fasterNode != null) {

			slowNode = slowNode.next;
			fasterNode = fasterNode.next;

		}

		slowNode.next = slowNode.next.next;

		return dummyNode.next;

	}

}
