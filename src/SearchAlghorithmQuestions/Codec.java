package SearchAlghorithmQuestions;

import java.util.HashMap;
import java.util.Map;

public class Codec {

	Map<String, String> encode = new HashMap<String, String>();
	Map<String, String> decode = new HashMap<String, String>();

	// Encodes a URL to a shortened URL.
	public String encode(String longUrl) {

		int number = longUrl.length();

		String shortUrl = "http://tinyurl.com/" + number;

		encode.put(longUrl, shortUrl);

		decode.put(shortUrl, longUrl);

		return encode.get(longUrl);
	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {

		return decode.get(shortUrl);
	}
}
