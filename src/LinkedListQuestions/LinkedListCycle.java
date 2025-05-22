package LinkedListQuestions;

public class LinkedListCycle {

	public boolean hasCycle(ListNode head) {

		ListNode slowPointer = head;
		ListNode fastPointer = head;

		// Burada fastPointer.next kontrol etmemiz sebebi fastPointer next null ise bir
		// sonraki alırken hata alırz diye
		while (slowPointer != null && fastPointer != null && fastPointer.next != null) {

			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;

			if (slowPointer == fastPointer) {
				return true;
			}

		}

		return false;
	}

}
