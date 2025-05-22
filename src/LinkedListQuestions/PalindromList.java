package LinkedListQuestions;

public class PalindromList {

	public boolean isPalindrome(ListNode head) {

		ListNode fast = head;
		ListNode slow = head;

		while (fast != null && fast.next != null) {

			slow = slow.next;
			fast = fast.next.next;

		}
		if (fast != null) {
			slow = slow.next;
		}

		ListNode prev = null;
		ListNode curr = slow;

		while (curr != null) {

			ListNode tempListNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = tempListNode;

		}

		while (prev != null) {

			if (prev.val != head.val) {
				return false;
			}
			prev = prev.next;
			head = head.next;
		}

		return true;

	}
}
