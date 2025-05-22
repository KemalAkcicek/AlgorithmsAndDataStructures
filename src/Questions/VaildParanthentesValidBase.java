package Questions;

import java.util.Stack;

public class VaildParanthentesValidBase {

	public static boolean isValid(String s) {

		// time o(n) space o(n)

		Stack<Character> paranthentes = new Stack<Character>();

		if (s.charAt(0) == ')') {
			return false;
		}

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(') {

				paranthentes.push(s.charAt(i));
			} else {

				if (paranthentes.isEmpty()) {
					return false;
				}
				paranthentes.pop();

			}

		}

		return paranthentes.size() == 0;
	}

	public static boolean isValid2(String s) {

		// time o(n) space o(1) space herhangi bir ekstra stack list kullanmadığımız
		// için o(1)

		int counter = 0;

		if (s.isEmpty())
			return true;

		if (s.charAt(0) == ')')
			return false;
		;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(') {

				counter++;
			} else {

				if (counter == 0) {

					return false;

				} else {
					counter--;
				}

			}

		}

		return counter == 0;
	}

	public static void main(String[] args) {

		String s = "(()())";
		String s1 = "()";
		String s2 = "())(";

		System.out.println(VaildParanthentesValidBase.isValid2(s));
		System.out.println(VaildParanthentesValidBase.isValid2(s1));
		System.out.println(VaildParanthentesValidBase.isValid2(s2));

	}

}
