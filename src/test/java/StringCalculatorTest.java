import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    private static final StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void add_should_return_the_sum_of_the_arguments() {
        String imput = "1,2";

        assertEquals("Should return the string: 3", "3", stringCalculator.add(imput));
    }

    @Test
    public void add_should_be_able_to_return_the_sum_of_3_arguments() {
        String imput = "1,2,3";

        assertEquals("Should return the string: 6", "6", stringCalculator.add(imput));
    }

    @Test
    public void add_should_take_at_most_3_arguments() {
        String imput = "1,2,3,4";

        assertEquals("Should return the string: To much arguments", "To much arguments", stringCalculator.add(imput));
    }

    @Test
    public void add_should_return_0_if_the_passed_arg_is_an_empty_string() {
        String imput = "";

        assertEquals("Should return the string: 0", "0", stringCalculator.add(imput));
    }
}
