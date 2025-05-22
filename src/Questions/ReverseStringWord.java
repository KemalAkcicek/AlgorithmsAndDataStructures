package Questions;

public class ReverseStringWord {

	public String reverseWords(String s) {

		String[] split = s.split(" ");

		StringBuilder stringBuilder = new StringBuilder();

		// "a good example"
		for (int i = split.length - 1; i >= 0; i--) {

			if (split[i].isBlank()) {
				continue;
			} else {
				stringBuilder.append(split[i]);
				stringBuilder.append(" ");
			}

		}

		return stringBuilder.toString().trim();

	}

}
