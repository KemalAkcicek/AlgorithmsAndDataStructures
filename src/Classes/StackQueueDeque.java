package Classes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackQueueDeque {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		System.out.println(stack);

		System.out.println(stack.pop());

		System.out.println(stack);

		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.add(10);
		deque.add(20);
		deque.add(30);

		System.out.println(deque);

		System.out.println(deque.pollFirst());

		System.out.println(deque);

	}

}
