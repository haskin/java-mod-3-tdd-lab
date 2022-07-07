import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(Arrays.toString(fizzBuzz.transformArray(new String[] { "f", "b", "fb", null })));
    }
}
