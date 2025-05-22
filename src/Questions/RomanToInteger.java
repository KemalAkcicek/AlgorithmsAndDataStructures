package Questions;

import java.util.HashMap;

public class RomanToInteger {

	public static int romanToInt(String s) {

		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		hashMap.put('I', 1);
		hashMap.put('V', 5);
		hashMap.put('X', 10);
		hashMap.put('L', 50);
		hashMap.put('C', 100);
		hashMap.put('D', 500);
		hashMap.put('M', 1000);

		int result = 0;

		for (int i = 0; i < s.length(); i++) {

			int currentValue = hashMap.get(s.charAt(i));

			if (i < s.length() - 1 && currentValue < hashMap.get(s.charAt(i + 1))) {
				result -= currentValue;
			} else {
				result += currentValue;
			}

		}

		return result;

	}

	public static void main(String[] args) {

		String s = "III";
		String s1 = "LVIII";
		String s2 = "MCMXCIV";

		System.out.println(romanToInt(s));
		System.out.println(romanToInt(s1));
		System.out.println(romanToInt(s2));

	}

}
