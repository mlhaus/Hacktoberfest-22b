package codewars;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;


public class TestDifferenceOf2 {



        @Test
        public void sample_tests() {
            assertArrayEquals(
                    new int[][]{{1, 3}, {2, 4}},
                    DifferenceOf2.twosDifference(new int[]{1, 2, 3, 4})
            );

            assertArrayEquals(
                    new int[][]{{1, 3}, {4, 6}},
                    DifferenceOf2.twosDifference(new int[]{1, 3, 4, 6})
            );

            assertArrayEquals(
                    new int[][]{{5, 7}, {11, 13}},
                    DifferenceOf2.twosDifference(new int[]{5,7,11,13})
            );

            assertArrayEquals(
                    new int[][]{{23, 25}, {55, 57}},
                    DifferenceOf2.twosDifference(new int[]{55, 23, 25, 57})
            );


        }


}
