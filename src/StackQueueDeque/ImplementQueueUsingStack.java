package StackQueueDeque;

import java.util.Stack;

public class ImplementQueueUsingStack {

	Stack<Integer> stack;
	Stack<Integer> reverseStack;

	public ImplementQueueUsingStack() {

		stack = new Stack<Integer>();
		reverseStack = new Stack<Integer>();

	}

	public void push(int x) {

		stack.push(x);

	}

	public int pop() {

		// Burada iki stackten birinindeki elemanları silip diğer stacke ekleyerek stack
		// reverse etmiş oluyoruz

		if (!reverseStack.isEmpty()) {

			return reverseStack.pop();

		} else {

			while (!stack.isEmpty()) {

				reverseStack.push(stack.pop());
			}

			return reverseStack.pop();

		}

	}

	public int peek() {

		if (!reverseStack.isEmpty()) {

			return reverseStack.peek();
		} else {

			while (!stack.isEmpty()) {

				reverseStack.push(stack.pop());
			}

		}

		return reverseStack.peek();

	}

	public boolean empty() {

		return stack.isEmpty() && reverseStack.isEmpty();

	}
}
