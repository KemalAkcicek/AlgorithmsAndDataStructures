package Questions;

public class LongestCommenPrefix {

	public static String longestCommonPrefix(String[] strs) {

		if (strs == null || strs.length == 0) {
			return "";
		}
		if (strs.length == 1) {
			return strs[0];
		}

		String prefix = strs[0];

		for (int i = 1; i < strs.length; i++) {

			// Burada index of metotu eğer aradığın değer baştan itibaren bulunurs 0 döner
			// flo flower burada flo flower içinde baştan yer aldığı için 0 döner

			while (strs[i].indexOf(prefix)  != 0) {

				prefix = prefix.substring(0, prefix.length() - 1);

				if (prefix.isEmpty()) {
					return "";
				}

			}

		}

		return prefix;
	}

	public static void main(String[] args) {

		String[] strings = { "flower", "flow", "flight" };
		String[] strings2 = { "dog", "racecar", "car" };
		String[] strings3 = {};

		System.out.println(longestCommonPrefix(strings));
		System.out.println(longestCommonPrefix(strings2));
		System.out.println(longestCommonPrefix(strings3));

	}

}
