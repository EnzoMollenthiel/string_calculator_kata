import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    private static final StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void add_should_return_the_sum_of_the_arguments() {
        String imput = "1,2";

        assertEquals("Should return the string: 3", "3", stringCalculator.add(imput));
    }
}
