package Classes;

import java.util.ArrayList;
import java.util.List;

class MyQueue<T> {

	List<T> queue;

	public MyQueue() {

		queue = new ArrayList<>();

	}

	public void enqueue(T eleman) {

		queue.add(eleman);

		System.out.println("Eleman eklendi: " + queue);

	}

	public void dequeue() {

		if (queue.isEmpty()) {

			System.out.println("Queue yapısı boştur");
		} else {

			queue.remove(0);

			System.out.println("Eleman silindi: " + queue);

		}

	}

	public void size() {

		System.out.println("Listenin size: " + queue.size());
	}

	public boolean isEmpty() {

		return queue.isEmpty();

	}

}

public class Queue {

	public static void main(String[] args) {

		MyQueue<Integer> myQueue = new MyQueue<>();

		myQueue.enqueue(10);

		myQueue.enqueue(20);

		myQueue.enqueue(30);

		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();

		myQueue.enqueue(40);

		myQueue.enqueue(50);

		myQueue.size();

		System.out.println(myQueue.isEmpty());

	}

}
