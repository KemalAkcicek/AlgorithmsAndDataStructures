package LinkedList;

public class SinglyLinkedList {

	Node head;
	Node tail;

	public SinglyLinkedList() {
		head = null;
		tail = null;

	}

	public void insert(int data) {

		Node newNode = new Node(data);

		if (head == null) {

			head = newNode;
			tail = newNode;
		} else {

			tail.next = newNode;
			tail = newNode;

		}

	}

	public void displayList() {

		Node current = head;

		if (current == null) {
			System.out.println("Gösterilecek eleman yok");
			return;
		} else {

			while (current != null) {

				System.out.print(current.value + "->");

				current = current.next;
			}
		}

	}

}
