public class StringCalculator {

    private static final String TO_MUCH_ARGUMENTS = "To much arguments";

    public String add(String input) {
        String[] numbers = input.split(",");
        Integer result = 0;

        if(numbers.length > 3) return TO_MUCH_ARGUMENTS;

        for(String number: numbers) {
            result += Integer.parseInt(number);
        }
        return result.toString();
    }
}
