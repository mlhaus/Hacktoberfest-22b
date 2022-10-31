package codewars;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.*;


public class TestMultiples {
    @Test
    public void test() {
        assertEquals(23, new Multiples().solution(10));
        assertEquals(8, new Multiples().solution(6));
        assertEquals(14, new Multiples().solution(8));
    }

}
