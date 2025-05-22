package Questions;

import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {

	Queue<Integer> queue;

	public MyStack() {

		queue = new ArrayDeque<Integer>();
	}

	public void push(int x) {

		queue.add(x);

	}

	public int pop() {

		// Burada queue elemanı silip sona ekliyoruz taki sonuna gelene kadar sonuna
		// geldiğimiz zaman ise sadece siliyoruz

		for (int i = 0; i <= queue.size() - 1; i++) {

			// Sona gelene kadar (size-1) sürekli olarak elemanı silip sona eklesin sona
			// geldiği zaman silsin

			if (i == queue.size() - 1) {

				return queue.remove();

			} else {

				Integer remove = queue.remove();

				queue.add(remove);

				System.out.println("Stack: " + queue);

			}

		}

		return 0;
	}

	public int top() {

		for (int i = 0; i <= queue.size() - 1; i++) {

			if (i == queue.size() - 1) {

				Integer remove2 = queue.remove();

				queue.add(remove2);

				return remove2;
			}

			Integer remove = queue.remove();

			queue.add(remove);

			System.out.println("top metodu: " + queue);

		}

		return 0;

	}

	public boolean empty() {

		return queue.isEmpty();

	}

	public Queue<Integer> get() {

		return queue;
	}
}

public class ImplementStackUsingQueues {

	public static void main(String[] args) {

		MyStack myStack = new MyStack();

		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);

		System.out.println(myStack.top());

		System.out.println(myStack.get());

	}

}
