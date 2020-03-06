import java.math.BigDecimal;

public class StringCalculator {

    private static final String TO_MUCH_ARGUMENTS = "To much arguments";

    public String add(final String input) {

        long count = input.chars().filter(ch -> ch == ',').count();

        if (input.length() == 0) return "0";
        else if(count > 2) return TO_MUCH_ARGUMENTS;

        String[] numbers = input.split(",");
        BigDecimal result = new BigDecimal(0);

        for(String number: numbers) {
            result = result.add(new BigDecimal(number));
        }

        return result.toString();
    }
}
