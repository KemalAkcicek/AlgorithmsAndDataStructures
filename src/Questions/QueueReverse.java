package Questions;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueReverse {

	public static Queue<Integer> queueReverse(Queue<Integer> queue) {

		// birinci while için o(n) ikinci while için o(n)
		// o(n)+o(n)=o(2n) bu ifadeyi sadeleşirse o(n) olur eğerki iç içe kullansaydık
		// o(n^2) olacaktı
		// Time complexity=o(n)
		// space complexity=0(n)

		Stack<Integer> stack = new Stack<Integer>();

		while (!queue.isEmpty()) {

			stack.add(queue.remove());

		}
		while (!stack.isEmpty()) {

			queue.add(stack.removeLast());
		}

		return queue;

	}

	public static void main(String[] args) {

		Queue<Integer> queue2 = new ArrayDeque<Integer>();

		queue2.add(10);
		queue2.add(20);
		queue2.add(30);
		queue2.add(40);

		System.out.println(QueueReverse.queueReverse(queue2));

	}
}
