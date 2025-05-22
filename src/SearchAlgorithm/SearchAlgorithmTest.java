package SearchAlgorithm;

import SearchAlghorithmQuestions.Codec;

public class SearchAlgorithmTest {

	public static void main(String[] args) {

		String longUrl = "https://leetcode.com/problems/design-tinsfsdfyurl";

		Codec codec = new Codec();

		String shortUrl = codec.encode(longUrl);

		System.out.println(shortUrl);
		System.out.println(codec.decode(shortUrl));

	}

}
