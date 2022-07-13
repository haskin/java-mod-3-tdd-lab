import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = "FizzBuzz";

    @BeforeEach
    void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void all_possible_fizzbuzz_array_input_parameters() {
        String[] input = { "f", "b", "fb", "str", null };
        String[] output = { "Fizz", "Buzz", "FizzBuzz", "str", null };
        assertArrayEquals(output, fizzBuzz.transformArray(input));
    }

    @Test
    void empty_array_when_input_array_is_empty() {
        assertEquals(0, fizzBuzz.transformArray(new String[0]).length);
    }

    @Test
    void null_when_string_array_is_null() {
        assertNull(fizzBuzz.transformArray(null));
    }

    // Test the "starts with f" case first - this should pass.
    @Test
    void Fizz_when_string_starts_with_f() {
        assertEquals(FIZZ, fizzBuzz.fizzBuzzString("fizz"));
    }

    // Test the "ends with b" case - this should also pass.
    @Test
    void Buzz_when_string_starts_with_b() {
        assertEquals(BUZZ, fizzBuzz.fizzBuzzString("b"));
    }

    // Test the "starts with f and ends with b" case - this will not pass.
    @Test
    void FizzBuzz_when_string_starts_with_f_and_ends_with_b() {
        assertEquals(FIZZ_BUZZ, fizzBuzz.fizzBuzzString("fb"));
    }

    // Add a test for when str is null - this will not pass.
    @Test
    void null_when_string_input_is_null() {
        assertNull(fizzBuzz.fizzBuzzString(null));
    }

    @Test
    void original_string_when_input_is_not_a_FizzBuzz() {
        String notFizzBuzz = "str";
        assertEquals(notFizzBuzz, fizzBuzz.fizzBuzzString(notFizzBuzz));
    }
}
