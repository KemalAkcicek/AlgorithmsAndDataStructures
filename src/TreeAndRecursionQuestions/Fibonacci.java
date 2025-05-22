package TreeAndRecursionQuestions;

public class Fibonacci {

	public int fib(int n) {

		if (n == 0 || n == 1) {
			return n;
		} else {

			return fib(n - 1) + fib(n - 2);
		}

	}

	public int iteratifFib(int n) {

		int x = 0;
		int y = 1;

		for (int i = 0; i <= n; i++) {

			int temp = y;
			y = y + x;
			x = temp;

		}

		return y;
	}

}
