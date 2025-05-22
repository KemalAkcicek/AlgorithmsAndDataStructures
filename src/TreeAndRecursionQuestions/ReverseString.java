package TreeAndRecursionQuestions;

public class ReverseString {

	public void reverseString(char[] s) {

		int left = 0;
		int right = s.length - 1;

		while (left < right) {

			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;

			left++;
			right--;

		}

		for (char temp : s) {
			System.out.println(temp);
		}

	}

	public void reverseStringRecursive(char[] s, int start, int end) {

		if (start > end) {
			return;

		} else {

			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;

			reverseStringRecursive(s, start + 1, end - 1);

		}

		for (char temp : s) {
			System.out.println(temp);
		}

	}

	public void reverseStringBruteForce(char[] s) {

		char[] array = new char[s.length];

		int k = 0;

		for (int i = s.length - 1; i >= 0; i--) {

			array[k] = s[i];
			k++;

		}

		for (int i = 0; i < s.length; i++) {

			s[i] = array[i];

		}

	}

}
