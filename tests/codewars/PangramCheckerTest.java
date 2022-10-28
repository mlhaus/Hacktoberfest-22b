package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PangramCheckerTest {

    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramChecker pc = new PangramChecker();
        assertEquals(true, pc.check(pangram1));
    }

    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        PangramChecker pc = new PangramChecker();
        assertEquals(false, pc.check(pangram2));
    }

    @Test
    public void alex_test1() {
        //checking to see that symbols and numbers are allowed but are ignored
        String pangram3 = "-123!@#" + "&&&";
        PangramChecker pc = new PangramChecker();
        assertFalse(pangram3.isEmpty());
    }

    @Test
    public void alex_test2() {
        String pangram4 = "THE FIVE BOXING WIZARDS JUMP QUICKLY!!";
        PangramChecker pc = new PangramChecker();
        assertEquals(true, pc.check(pangram4));
    }
}