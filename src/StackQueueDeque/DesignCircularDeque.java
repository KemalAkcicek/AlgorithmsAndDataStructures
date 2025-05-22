package StackQueueDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DesignCircularDeque {

	Deque<Integer> deque;

	int capacity;

	public DesignCircularDeque(int k) {

		deque = new ArrayDeque<Integer>(k);
		capacity = k;

	}

	public boolean insertFront(int value) {

		if (deque.size() < capacity) {

			deque.addFirst(value);
			return true;
		} else {
			return false;
		}

	}

	public boolean insertLast(int value) {

		if (deque.size() < capacity) {

			deque.addLast(value);
			return true;
		} else {
			return false;
		}

	}

	public boolean deleteFront() {

		if (deque.isEmpty()) {
			return false;
		} else {
			deque.removeFirst();

			return true;
		}

	}

	public boolean deleteLast() {

		if (deque.isEmpty()) {
			return false;
		} else {
			deque.removeLast();

			return true;
		}

	}

	public int getFront() {

		if (deque.isEmpty()) {
			return -1;
		} else {

			return deque.getFirst();

		}

	}

	public int getRear() {

		if (deque.isEmpty()) {
			return -1;
		} else {

			return deque.getLast();

		}

	}

	public boolean isEmpty() {

		return deque.isEmpty();

	}

	public boolean isFull() {

		return deque.size() == capacity;

	}

}
