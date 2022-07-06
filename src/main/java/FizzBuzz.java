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

	public String[] fizzBuzzArray(String[] strings) {
		return null;
	}

}
