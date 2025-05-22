package StackQueueDeque;

import java.util.Deque;
import java.util.LinkedList;

public class Palindrom {

	public static boolean isPalindrom(String element) {

		// time=o(n) for=o(n) while=o(n) belirli bir sayıdaki elemanlar için yani n tane
		// için 2 döngüde gezsek bile o(n) oluyor
		// space zaten o(n)

		Deque<Character> deque = new LinkedList<Character>();

		for (char temp : element.toLowerCase().toCharArray()) {

			if (Character.isLetterOrDigit(temp)) {

				deque.offerLast(temp);
			}

		}

		while (deque.size() > 1) {

			// Poll first yaptığı işlem şu şekilde ilk elemani çek ve sil yada tam tersi son
			// eleman için yapıyor
			if (deque.pollFirst() != deque.pollLast()) {

				return false;

			}
		}

		return true;
	}

	public static boolean isPalindrom2(String element) {

		int left = 0;
		int right = element.length() - 1;

		while (left < right) {

			if (element.charAt(left) != element.charAt(right)) {
				return false;
			}

			left++;
			right--;

		}

		return true;
	}

	public static void main(String[] args) {

		System.out.println(Palindrom.isPalindrom("madkam"));
		System.out.println(Palindrom.isPalindrom2("madkam"));

	}

}
