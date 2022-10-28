package codewars;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FixedTests {
    @Test
    void basic() {
        assertEquals("6", Kata.getBestCombination(6));
        assertEquals("33", Kata.getBestCombination(33));
        assertEquals("60", Kata.getBestCombination(60));
        assertEquals("111", Kata.getBestCombination(71));
        assertEquals("72", Kata.getBestCombination(72));
        assertEquals("90", Kata.getBestCombination(90));
        assertEquals("99", Kata.getBestCombination(99));
        assertEquals("155", Kata.getBestCombination(115));
        assertEquals("201", Kata.getBestCombination(121));
        assertEquals("300", Kata.getBestCombination(180));
        assertEquals("433", Kata.getBestCombination(273));
        assertEquals("399", Kata.getBestCombination(279));
        assertEquals("6130", Kata.getBestCombination(3690));
        assertEquals("7777", Kata.getBestCombination(4697));
        assertEquals("8735", Kata.getBestCombination(5255));
    }
}