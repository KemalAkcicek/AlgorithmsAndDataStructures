package LinkedListQuestions;

public class Partition {
	public ListNode partition(ListNode head, int x) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode less = new ListNode();
		ListNode tempLess = less;

		ListNode greater = new ListNode();
		ListNode tempGreater = greater;

		while (head != null) {

			if (head.val < x) {

				tempLess.next = head;
				tempLess = tempLess.next;

			} else {

				tempGreater.next = head;
				tempGreater = tempGreater.next;

			}

			head = head.next;

		}
		tempLess.next = greater.next;
		tempGreater.next = null;

		return less.next;

	}
}
