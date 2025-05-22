package SortingAlgorithmQuestions;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {

	private PriorityQueue<Integer> maxHeap;

	private PriorityQueue<Integer> minHeap;

	public MedianFinder() {

		maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		minHeap = new PriorityQueue<Integer>();

	}

	public void addNum(int num) {

		// İlk olarak maxheap ekledik
		maxHeap.offer(num);

		minHeap.offer(maxHeap.poll());

		if (maxHeap.size() < minHeap.size()) {

			maxHeap.offer(minHeap.poll());
		}
	}

	public double findMedian() {

		if (maxHeap.size() == minHeap.size()) {

			return (maxHeap.peek() + minHeap.peek())/2.0;
		}

		return maxHeap.peek();

	}

}
