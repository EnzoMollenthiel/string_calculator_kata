import java.math.BigDecimal;

public class StringCalculator {

    public String add(final String input) {
        int unexpectedCharPosition = input.indexOf(",\n");

        if (input.length() == 0) return "0";
        else if (unexpectedCharPosition != -1)
            return "Number expected but '\\n' found at position " + (unexpectedCharPosition + 1) + ".";
        else if (input.charAt(input.length() - 1) == ',') return "Number expected but EOF found.";

        String numbersString = input.replaceAll("\n",",");
        String[] numbers = numbersString.split(",");

        BigDecimal result = new BigDecimal(0);

        for(String number: numbers) {
            result = result.add(new BigDecimal(number));
        }

        return result.toString();
    }
}
