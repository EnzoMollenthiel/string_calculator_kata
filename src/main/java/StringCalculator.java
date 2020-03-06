import java.math.BigDecimal;

public class StringCalculator {

    public String add(final String input) {
        int unexpectedCharPosition = input.indexOf(",\n");

        if (input.length() == 0)
            return "0";
        else if (unexpectedCharPosition != -1)
            return "Number expected but '\\n' found at position " + (unexpectedCharPosition + 1) + ".";
        else if (input.charAt(input.length() - 1) == ',')
            return "Number expected but EOF found.";

        String numbersString = input;
        String separators = "\n";

        if(input.substring(0,2).equals("//")) {
            separators = input.substring(2,4);
            separators = separators.charAt(0) + "|" + separators.charAt(1);
            numbersString = input.substring(4, input.length());
        }

        numbersString = numbersString.replaceAll("["+ separators + "]", ",");
        String[] numbers = numbersString.split(",");

        BigDecimal result = new BigDecimal(0);

        for(String number: numbers) {
            result = result.add(new BigDecimal(number));
        }

        return result.toString();
    }
}
