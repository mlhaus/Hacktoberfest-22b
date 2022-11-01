package codewars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreatePhoneNumberTest {

    @Test
    void createPhoneNumber() {
        assertEquals("(123) 456-7890", CreatePhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        int[] numbers = {3, 2, 1, 5, 6, 7, 8, 9, 2, 5};
        assertTrue(CreatePhoneNumber.createPhoneNumber(numbers).equals("(321) 567-8925"));
        assertFalse(CreatePhoneNumber.createPhoneNumber(numbers).equals("(529) 876-5123"));
    }
}