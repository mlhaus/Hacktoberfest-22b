package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class FindTheUniqueNumberTest {
        private double precision = 0.0000000000001;

        @Test
        public void sampleTestCases() {
            assertEquals(1.0, FindTheUniqueNumber.findUniq(new double[]{0, 1, 0}), precision);
            assertEquals(2.0, FindTheUniqueNumber.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
            assertEquals(3.0, FindTheUniqueNumber.findUniq(new double[]{3,1,1,1,1}), precision);
            assertEquals(4.0, FindTheUniqueNumber.findUniq(new double[]{1,1,1,1,4}), precision);

        }
    }

