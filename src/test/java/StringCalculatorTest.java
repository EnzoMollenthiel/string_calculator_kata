import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    private static final StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void add_should_return_the_sum_of_the_arguments() {
        String input = "1,2";

        assertEquals("Should return the string: 3", "3", stringCalculator.add(input));
    }

    @Test
    public void add_should_be_able_to_return_the_sum_of_3_arguments() {
        String input = "1,2,3";

        assertEquals("Should return the string: 6", "6", stringCalculator.add(input));
    }


    @Test
    public void add_should_take_any_number_of_arguments() {
        String input = "1,2,3,4";

        assertEquals("Should return the string: 10", "10", stringCalculator.add(input));
    }

    @Test
    public void add_should_return_0_if_the_passed_arg_is_an_empty_string() {
        String input = "";

        assertEquals("Should return the string: 0", "0", stringCalculator.add(input));
    }

    @Test
    public void add_should_manage_decimal_numbers() {
        String input = "1.1,2.2";

        assertEquals("Should return the string: 3.3", "3.3", stringCalculator.add(input));
    }

    @Test
    public void add_should_be_able_to_split_on_linefeed() {
        String input = "1\n2.2";

        assertEquals("Should return the string: 3.2", "3.2", stringCalculator.add(input));
    }

    @Test
    public void add_should_return_error_message_on_unexpected_linefeed() {
        String input = "1,\n2";

        assertEquals("Should return the string: Number expected but '\\n' found at position 2.",
                "Number expected but '\\n' found at position 2.", stringCalculator.add(input));
    }

    @Test
    public void add_should_return_error_message_when_missing_last_number() {
        String input = "1,2,";

        assertEquals("Should return the string: Number expected but EOF found.",
                "Number expected but EOF found.", stringCalculator.add(input));
    }

    @Test
    public void add_should_be_able_to_use_custom_separator() {
        String input = "//;\n1;2";

        assertEquals("Should return the string: 3",
                "3", stringCalculator.add(input));
    }
}
