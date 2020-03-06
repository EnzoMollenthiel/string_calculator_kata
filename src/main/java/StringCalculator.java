import java.math.BigDecimal;

public class StringCalculator {

    public String add(String input) {

        if (input.length() == 0) return "0";

        input = input.replaceAll("\n",",");

        String[] numbers = input.split(",");
        BigDecimal result = new BigDecimal(0);

        for(String number: numbers) {
            result = result.add(new BigDecimal(number));
        }

        return result.toString();
    }
}
