package TreeAndRecursionQuestions;

public class Test {

	public static void main(String[] args) {

		/*
		 * char[] s = { 'k', 'e', 'm', 'a', 'l' };
		 * 
		 * ReverseString reverseString = new ReverseString();
		 * 
		 * reverseString.reverseString(s);
		 * 
		 * System.out.println("***********");
		 * 
		 * reverseString.reverseStringRecursive(s, 0, s.length - 1);
		 */
		/*
		 * Fibonacci fibonacci = new Fibonacci();
		 * 
		 * System.out.println(fibonacci.iteratifFib(10));
		 * System.out.println(fibonacci.iteratifFib(9));
		 * System.out.println(fibonacci.iteratifFib(8));
		 */

		Memorization memorization = new Memorization();

		int[] array = { 5, 10, 15, 5, 20, 30, 40, 10, 5, 25, 5 };

		for (int temp : array) {

			System.out.println(memorization.memorilazition(temp));
		}

	}

}
