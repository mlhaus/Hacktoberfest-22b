package codewars;

// https://www.codewars.com/kata/5f25f475420f1b002412bb1f/java

public class FindTheNumberPlate {
    public static String findTheNumberPlate(int customerID) {
        int backNumbers = (customerID) / 999;
        int frontNumbers = (customerID) % 999 + 1;

        int firstLetter = backNumbers % 26;
        backNumbers /= 26;
        int secondLetter = backNumbers % 26;
        backNumbers /= 26;
        int thirdLetter = backNumbers;

        return "" + (char)('a' + firstLetter) + (char)('a' + secondLetter) + (char)('a' + thirdLetter) + String.format("%03d",frontNumbers);
    }
}
