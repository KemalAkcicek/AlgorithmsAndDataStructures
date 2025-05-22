package LinkedListQuestions;

public class IntersectionNode {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		ListNode firstNode = headA;
		ListNode secondNode = headB;

		while (firstNode != secondNode) {

			firstNode = firstNode == null ? headB : firstNode.next;

			secondNode = secondNode == null ? headA : secondNode.next;

		}

		return firstNode;

	}

}
