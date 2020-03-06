public class StringCalculator {

    public String add(String input) {
        String[] numbers = input.split(",");
        Integer result = 0;

        if(numbers.length > 3) return "To much arguments";

        for(String number: numbers) {
            result += Integer.parseInt(number);
        }
        return result.toString();
    }
}
