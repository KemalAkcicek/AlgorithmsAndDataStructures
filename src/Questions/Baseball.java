package Questions;

import java.util.Stack;

public class Baseball {

	public int calPoints(String[] operations) {

		Stack<Integer> stack = new Stack<Integer>();

		int result = 0;

		for (int i = 0; i < operations.length; i++) {

			if (operations[i].equals("C")) {

				stack.removeLast();

			}

			else if (operations[i].equals("+")) {

				int value = stack.getLast() + stack.get(stack.size() - 2);

				stack.add(value);

			}

			else if (operations[i].equals("D")) {

				int value = stack.getLast() * 2;

				stack.add(value);
			}

			else {

				int value = Integer.parseInt(operations[i]);

				stack.add(value);
			}

		}

		for (Integer value : stack) {

			result += value;
		}

		return result;

	}

	public static void main(String[] args) {

		Baseball baseball = new Baseball();

		String[] operation = { "5", "2", "C", "D", "+" };

		String[] operation2 = { "5", "-2", "4", "C", "D", "9", "+", "+" };

		String[] operation3 = { "1", "C" };

		System.out.println(baseball.calPoints(operation));
		System.out.println(baseball.calPoints(operation2));
		System.out.println(baseball.calPoints(operation3));

	}

}
