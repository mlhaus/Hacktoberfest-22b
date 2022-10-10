package codewars;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestFindOdd {
    //    https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java
    @Test
    public void findTest() {
        assertEquals(5, FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        assertEquals(-1, FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        assertEquals(5, FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        assertEquals(10, FindOdd.findIt(new int[]{10}));
        assertEquals(10, FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        assertEquals(1, FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
        // new test cases
        assertEquals(3, FindOdd.findIt(new int[]{5,3,3,7,8,5,2,1,3,1,7,2,8}));
        assertEquals(10, FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10,1,10}));
        assertEquals(-2, FindOdd.findIt(new int[]{2,1,-1,2,-2,5,-2,4,4,-1,-2,5,1}));
    }
}
