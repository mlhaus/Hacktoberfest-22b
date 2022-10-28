package codewars;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestPhoneNumber {

    @Test
    public void teft_createPhoneNumber() {

        // Test correct generic input.
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String result = PhoneNumber.createPhoneNumber(intArray);
        assertEquals("(123) 456-7890", result);

        // Test correct specific input.
        int[] intArray2 = {3, 2, 1, 6, 5, 4, 8, 9, 0, 7};
        String result2 = PhoneNumber.createPhoneNumber(intArray2);
        assertEquals("(321) 654-8907", result2);

        // Test incorrect input. (Int out of accepted range for digit.)
        int[] intArray3 = {12, 24, 32, 41, 55, 63, 77, 86, 98, 34};
        assertThrows(IllegalArgumentException.class, () -> PhoneNumber.createPhoneNumber(intArray3));

        // Test incorrect input. (Total digit count exceeding allowed number of digits.)
        int[] intArray4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
        assertThrows(IllegalArgumentException.class, () -> PhoneNumber.createPhoneNumber(intArray4));

        // Test incorrect input. (Int out of accepted range for digit AND total digit count exceeding allowed number of digits.)
        int[] intArray5 = {12, 24, 32, 41, 55, 63, 77, 86, 98, 34, 45};
        assertThrows(IllegalArgumentException.class, () -> PhoneNumber.createPhoneNumber(intArray5));
    }
}