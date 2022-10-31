package codewars;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GoodVsEvilTest {
    @Test
    public void testEvilWin() {

        assertEquals("Battle Result: Evil eradicates all trace of Good",
                GoodVsEvil.battle("1 1 1 1 1 1", "1 1 1 1 1 1 1"));
    }

    @Test
    public void testGoodWin() {
        assertEquals( "Battle Result: Good triumphs over Evil",
                GoodVsEvil.battle("0 0 0 0 0 10", "0 1 1 1 1 0 0"));
    }

    @Test
    public void testTie() {
        assertEquals("Battle Result: No victor on this battle field",
                GoodVsEvil.battle("1 0 0 0 0 0", "1 0 0 0 0 0 0"));
    }

    @Test
    public void randomTest() {
        assertEquals("Battle Result: Evil eradicates all trace of Good",
                GoodVsEvil.battle("6711 5221 1717 7587 8900 172", "3658 4405 4638 3657 2079 310 7283"));
    }
    @Test
    public void randomTestTwo() {
        assertEquals("Battle Result: Evil eradicates all trace of Good",
                GoodVsEvil.battle("6 21 117 758 89 172", "0 40555 4638 3657 74 310 3"));
    }


}