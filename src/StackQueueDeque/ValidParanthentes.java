package StackQueueDeque;

import java.util.Stack;

public class ValidParanthentes {

	public static boolean isValid(String s) {

		Stack<Character> stack = new Stack<Character>();

		if (s.charAt(0) == '}' || s.charAt(0) == ')' || s.charAt(0) == ']') {

			return false;
		}

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {

				stack.push(s.charAt(i));

			}

			else {
				if (stack.isEmpty()) {
					return false;
				}

				Character characher = stack.pop();

				if (s.charAt(i) == ')' && characher != '(' || s.charAt(i) == '}' && characher != '{'
						|| s.charAt(i) == ']' && characher != '[') {

					return false;

				}

			}

		}

		return stack.isEmpty();

	}

	public static void main(String[] args) {

		String s1 = "()";
		String s2 = "()[]{}";
		String s3 = "(]";

		System.out.println(ValidParanthentes.isValid(s1));
		System.out.println(ValidParanthentes.isValid(s2));
		System.out.println(ValidParanthentes.isValid(s3));

	}

}
