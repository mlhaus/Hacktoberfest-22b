package codewars;

public class PhoneNumber {
    public static String createPhoneNumber(int[] intArray) {
        String result = "";
        // Check for length so we can minimize the switch statement by
        // saving the default value for specific instances where the
        // int provided in the array doesn't need concatenation to be put in the string.
        if(intArray.length != 10) {
            throw new IllegalArgumentException("The array provided is too large for a phone number.");
        }
        try {
            for (int i = 0; i <= 9; i++) {
                if(intArray[i] > 9 || intArray[i] < 0) {
                    throw new Exception("Integer provided in the array is either above nine or negative.");
                }
                    switch(i) {
                        case 0: result += "(" + intArray[i];
                        break;
                        case 2: result += intArray[i] + ") ";
                        break;
                        case 5: result += intArray[i] + "-";
                        break;
                        // Default statement is used for scenarios
                        // where the concatenation is not needed.
                        // If the code above wasn't there this switch
                        // statement would be 10 cases long. (Inefficient)
                        // Tldr: Always check for the abnormal and not the norm.
                        default: result += intArray[i];
                        break;
                }
            }
        } catch(Exception e) {
            throw new IllegalArgumentException("Bad input was entered! Make sure that all numbers within the array provided are 0 through 9.");
        }
        return result;
    }
}
