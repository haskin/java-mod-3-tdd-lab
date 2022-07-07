import java.util.stream.IntStream;

public class FizzBuzz {

	public String fizzBuzzString(String str) {
		try {
			if (str.startsWith("f") && str.endsWith("b"))
				return "FizzBuzz";
			if (str.startsWith("f"))
				return "Fizz";
			if (str.endsWith("b"))
				return "Buzz";

			return str;
		} catch (NullPointerException e) {
			return null;
		}
	}

	public String[] transformArray(String[] words) {
		if (words == null)
			return null;

		return IntStream.range(0, words.length)
				.mapToObj(index -> fizzBuzzString(words[index]))
				.toArray(String[]::new);
	}

}
