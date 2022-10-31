package codewars;

import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class TribonacciSequenceTest {
    private TribonacciSequence variabonacci = new TribonacciSequence();

//    @Before
//    public void setUp() throws Exception {
//        variabonacci = new TribonacciSequence();
//    }    This was in the codewars test file. My code worked on codewars. Here this function was causing a nullPointerException.
    //     Because all the function does is make variabonacci a new TribonacciSequence I just moved the assignment to
    //     where the variable was declared.

    @After
    public void tearDown() throws Exception {
        variabonacci = null;
    }

    private double precision = 1e-10;

    @Test
    public void sampleTests() {
        assertArrayEquals(new double []{1,1,1,3,5,9,17,31,57,105}, variabonacci.tribonacci(new double []{1,1,1},10), precision);
        assertArrayEquals(new double []{0,0,1,1,2,4,7,13,24,44}, variabonacci.tribonacci(new double []{0,0,1},10), precision);
        assertArrayEquals(new double []{0,1,1,2,4,7,13,24,44,81}, variabonacci.tribonacci(new double []{0,1,1},10), precision);

        // ------------- tests I added (for aspects of Kata listed in directions but not tested -------------

        // Exception thrown if signature is not 3 long
        assertThrows(IllegalArgumentException.class, () -> variabonacci.tribonacci(new double []{1,1},10));
        assertThrows(IllegalArgumentException.class, () -> variabonacci.tribonacci(new double []{1,2,3,4},8));
        // Exception thrown if n is negative
        assertThrows(IllegalArgumentException.class, () -> variabonacci.tribonacci(new double []{0,1,1}, -1));
        // asking for less than 3 values
        assertArrayEquals(new double []{}, variabonacci.tribonacci(new double []{0,1,1},0), precision);
        assertArrayEquals(new double []{0,1}, variabonacci.tribonacci(new double []{0,1,1},2), precision);
    }
}