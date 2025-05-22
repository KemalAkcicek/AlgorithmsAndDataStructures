package LinkedList;

public class DoubleLinkedList {

	Node2 head;
	Node2 tail;

	public DoubleLinkedList() {

		head = null;
		tail = null;

	}

	public void insert(int data) {

		Node2 newNode2 = new Node2(data);

		if (head == null) {

			head = newNode2;
			tail = newNode2;

			head.previvous = null;
			tail.next = null;

		} else {

			tail.next = newNode2;

			newNode2.previvous = tail;

			tail = newNode2;

			tail.next = null;

		}

	}

	public void displayList() {

		if (head == null) {

			System.out.println("Gösterilecek eleman yok");
		} else {

			Node2 current = head;

			while (current != null) {

				System.out.print(current.value+ "->");
				current = current.next;
			}

		}

	}

	public void reversedisplayList() {

		if (head == null) {

			System.out.println("Gösterilecek eleman yok");
		} else {

			Node2 current = tail;

			while (current != null) {

				System.out.print(current.value + "->");
				current = current.previvous;
			}

		}

	}

}
