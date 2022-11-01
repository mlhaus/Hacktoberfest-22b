package codewars;
import static codewars.WriteNumbersInExpandedForm.expandedForm;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.*;

class TestWriteNumbersInExpandedForm {
@Test
public void testSample() {
        assertEquals(  "40 + 2", expandedForm(42));
        assertEquals(  "2", expandedForm(2));
        assertEquals("800 + 20", expandedForm(820));
        assertEquals("1000000000", expandedForm(1000000000));
        assertEquals("10 + 2", expandedForm(12));
        assertEquals("70000 + 300 + 4", expandedForm(70304));
}
}
