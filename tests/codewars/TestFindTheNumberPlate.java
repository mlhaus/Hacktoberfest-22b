package codewars;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFindTheNumberPlate {
    @Test
    public void test() {
        assertEquals("aaa004", codewars.FindTheNumberPlate.findTheNumberPlate(3));
        assertEquals("baa489", codewars.FindTheNumberPlate.findTheNumberPlate(1487));
        assertEquals("oba041", codewars.FindTheNumberPlate.findTheNumberPlate(40000));
        assertEquals("rba100", codewars.FindTheNumberPlate.findTheNumberPlate(43056));
        assertEquals("zzz999", codewars.FindTheNumberPlate.findTheNumberPlate(17558423));
        assertEquals("aja802", codewars.FindTheNumberPlate.findTheNumberPlate(234567));
        // mine
        assertEquals("abc123",FindTheNumberPlate.findTheNumberPlate(1376744));
        assertEquals("tit135",FindTheNumberPlate.findTheNumberPlate(13058063));
        assertEquals("xyz789",FindTheNumberPlate.findTheNumberPlate(17530241));
    }
}
