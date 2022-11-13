package codewars;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.Arrays;


public class TestSortTheOdd {
    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, SortTheOdd.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, SortTheOdd.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, SortTheOdd.sortArray(new int[]{}));
    }

    @Test
    public void myTest1(){
        int[] arr = {1,2,3,4,5};
        assertEquals(Arrays.toString(arr), Arrays.toString(SortTheOdd.sortArray(arr)));
    }

    @Test
    public void myTest2(){
        int[] arr = {5,2,3,4,1};
        int[] sorted = SortTheOdd.sortArray(arr);
        assertTrue(sorted[0] == 1);
        assertTrue(sorted[2] == 3);
        assertTrue(sorted[4] == 5);

    }
}
