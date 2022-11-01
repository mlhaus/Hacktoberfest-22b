package codewars;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        String result = "(";
        String end = ") ";
        String dash = "-";
        for(int i = 0; i < numbers.length; i++) {
            result += numbers[i];
            if (i == 2) {
                result += end;
            }
            else if (i == 5) {
                result += dash;
            }
        }
        return result;
    }
}