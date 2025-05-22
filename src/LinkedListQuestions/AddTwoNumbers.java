package LinkedListQuestions;

public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode listNode = new ListNode();// En baştaki değeri kaybetmemek için dummy değişkeni oluşturuyorzuz
		ListNode headNode = listNode;
		int carry = 0;

		while (l1 != null || l2 != null) {

			int x = (l1 != null) ? l1.val : 0;
			int y = (l2 != null) ? l2.val : 0;

			int sum = x + y + carry;
			carry = sum / 10;

			headNode.next = (l1 != null) ? l1 : l2;
			headNode.next.val = sum % 10;

			headNode = headNode.next;

			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;

		}

		if (carry > 0) {
			headNode.next = new ListNode(carry);
		}

		return listNode.next;
	}

}
