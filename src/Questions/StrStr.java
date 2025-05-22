package Questions;

public class StrStr {

	public int strStr(String haystack, String needle) {

		int haystackLen = haystack.length();
		int needleLen = needle.length();

		if (needle.isEmpty()) {
			return 0;
		}

		if (haystackLen < needleLen) {
			return -1;
		}

		for (int i = 0; i <= haystackLen - needleLen; i++) {

			boolean match = true;

			for (int j = 0; j < needleLen; j++) {

				if (haystack.charAt(i + j) != needle.charAt(j)) {

					match = false;
					break;

				}
			}

			if (match) {
				return i;
			}
		}

		return -1;
	}

}
