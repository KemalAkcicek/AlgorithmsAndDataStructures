package StackQueueDeque;

import java.util.Stack;

public class MinStack {

	Stack<Integer> stack;
	Stack<Integer> minStack;

	public MinStack() {

		stack = new Stack<Integer>();
		minStack = new Stack<Integer>();

	}

	public void push(int val) {

		stack.push(val);

		if (minStack.isEmpty() || val <= minStack.peek()) {
			minStack.push(val);
		}

	}

	public void pop() {

		if (stack.isEmpty()) {
			return;
		} else {
			int pop = stack.pop();

			if (pop == minStack.peek()) {
				minStack.pop();
			}
		}

	}

	public int top() {

		return stack.peek();

	}

	public int getMin() {

		return minStack.peek();
	}

}
