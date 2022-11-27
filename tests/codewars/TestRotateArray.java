package codewars;

//import org.junit.After;
//import org.junit.Before;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestRotateArray {
    private RotateArray rotateArray = new RotateArray();


    @Before
    public void setUp() {
        this.rotateArray = new RotateArray();
    }

    @After
    public void tearDown() {
        this.rotateArray = null;
    }

    @Test
    public void testRotateArray() {
        assertArrayEquals(rotateArray.rotate(new Object[]{1, 2, 3, 4, 5}, 1), new Object[]{5, 1, 2, 3, 4});
        assertArrayEquals(rotateArray.rotate(new Object[]{1, 2, 3, 4, 5}, 6), new Object[]{5, 1, 2, 3, 4});
        assertArrayEquals(rotateArray.rotate(new Object[]{1, 2, 3, 4, 5}, -1), new Object[]{2, 3, 4, 5, 1});
        assertArrayEquals(rotateArray.rotate(new Object[]{1, 2, 3, 4, 5}, -6), new Object[]{2, 3, 4, 5, 1});
    }

    @Test
    public void testRotateOne_ArrayOfFive() {
        assertArrayEquals(new Object[]{5, 1, 2, 3, 4},
                rotateArray.rotate(new Object[]{1, 2, 3, 4, 5}, 1));
    }

    @Test
    public void testRotateTwo_ArrayOfFive() {
        assertArrayEquals(new Object[]{4, 5, 1, 2, 3},
                rotateArray.rotate(new Object[]{1, 2, 3, 4, 5}, 2));
    }

    @Test
    public void testRotateThree_ArrayOfFive() {
        assertArrayEquals(new Object[]{3, 4, 5, 1, 2},
                rotateArray.rotate(new Object[]{1, 2, 3, 4, 5}, 3));
    }

    @Test
    public void testRotateFour_ArrayOfFive() {
        assertArrayEquals(new Object[]{2, 3, 4, 5, 1},
                rotateArray.rotate(new Object[]{1, 2, 3, 4, 5}, 4));
    }

    @Test
    public void testRotateFive_ArrayOfFive() {
        assertArrayEquals(new Object[]{1, 2, 3, 4, 5},
                rotateArray.rotate(new Object[]{1, 2, 3, 4, 5}, 5));
    }

    @Test
    public void testRotateSix_ArrayOfFive() {
        assertArrayEquals(new Object[]{5, 1, 2, 3, 4},
                rotateArray.rotate(new Object[]{1, 2, 3, 4, 5}, 6));
    }

    @Test
    public void testRotateNegOne_ArrayOfFive() {
        assertArrayEquals(new Object[]{2, 3, 4, 5, 1},
                rotateArray.rotate(new Object[]{1, 2, 3, 4, 5}, -1));
    }

    @Test
    public void testRotateNegTwo_ArrayOfFive() {
        assertArrayEquals(new Object[]{3, 4, 5, 1, 2},
                rotateArray.rotate(new Object[]{1, 2, 3, 4, 5}, -2));
    }

    @Test
    public void testRotateNegThree_ArrayOfFive() {
        assertArrayEquals(new Object[]{4, 5, 1, 2, 3},
                rotateArray.rotate(new Object[]{1, 2, 3, 4, 5}, -3));
    }

    @Test
    public void testRotateNegFour_ArrayOfFive() {
        assertArrayEquals(new Object[]{5, 1, 2, 3, 4},
                rotateArray.rotate(new Object[]{1, 2, 3, 4, 5}, -4));
    }

    @Test
    public void testRotateNegFive_ArrayOfFive() {
        assertArrayEquals(new Object[]{1, 2, 3, 4, 5},
                rotateArray.rotate(new Object[]{1, 2, 3, 4, 5}, -5));
    }

    @Test
    public void testRotateNegSix_ArrayOfFive() {
        assertArrayEquals(new Object[]{2, 3, 4, 5, 1},
                rotateArray.rotate(new Object[]{1, 2, 3, 4, 5}, -6));
    }
}