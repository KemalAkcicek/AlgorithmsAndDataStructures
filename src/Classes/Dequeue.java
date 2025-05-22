package Classes;

import java.util.ArrayList;
import java.util.List;

class MyDequeue<T> {

	List<T> dequeue;

	public MyDequeue() {

		dequeue = new ArrayList<>();
	}

	public void addRight(T eleman) {

		dequeue.add(0, eleman);

		System.out.println("Dequeue yapısından başına eleman eklendi: " + dequeue);

	}

	public void addLeft(T eleman) {

		dequeue.add(eleman);

		System.out.println("Dequeue yapısından sonuna eleman eklendi: " + dequeue);

	}

	public void removeLeft() {

		if (dequeue.isEmpty()) {

			System.out.println("Dequeue yapısından silinecek elemena yok");
		}
		else {
			
			
		dequeue.remove(dequeue.size() - 1);
		System.out.println("Dequeue yapısından sonundan eleman silindi: " + dequeue);
		}

		
	}

	public void removeRight() {

		if (dequeue.isEmpty()) {

			System.out.println("Dequeue yapısından silinecek elemena yok");
		}
		else {
			
			dequeue.remove(0);

			System.out.println("Dequeue yapısından başından eleman silindi: " + dequeue);
		}

		
	}

}

public class Dequeue {

	public static void main(String[] args) {

		MyDequeue<Integer> myDequeue = new MyDequeue<>();

		myDequeue.addRight(10);

		myDequeue.addRight(20);

		myDequeue.removeLeft();

		myDequeue.removeRight();

		myDequeue.addLeft(30);

		myDequeue.addLeft(40);
		
		myDequeue.removeLeft();
		myDequeue.removeLeft();
		myDequeue.removeLeft();
		myDequeue.removeLeft();

	}

}
