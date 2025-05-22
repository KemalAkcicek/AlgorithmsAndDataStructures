package StackQueueDeque;

import java.util.ArrayDeque;
import java.util.Queue;

public class RecentCounter {

	Queue<Integer> queue;

	int minValue = 0;

	public RecentCounter() {

		queue = new ArrayDeque<Integer>();

	}

	public int ping(int t) {

		queue.add(t);

		// Eski istekleri siliyoruz
		while (!queue.isEmpty() && queue.peek() < t - 3000) {

			queue.poll();
		}

		return queue.size();
	}

}
