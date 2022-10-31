package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GiveMeADiamondTest {

    @Test
    public void testDiamond3() {
        StringBuffer expected = new StringBuffer();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        assertEquals(expected.toString(), GiveMeADiamond.print(3));
    }

    @Test
    public void testDiamond5() {
        StringBuffer expected = new StringBuffer();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        assertEquals(expected.toString(), GiveMeADiamond.print(5));
    }

    @Test
    public void testDiamond1() {
        StringBuffer expected = new StringBuffer();
        expected.append("*\n");
        assertEquals(expected.toString(), GiveMeADiamond.print(1));
    }

    @Test
    public void testDiamond0() {
        assertEquals(null, GiveMeADiamond.print(0));
    }

    @Test
    public void testDiamondMinus2() {
        assertEquals(null, GiveMeADiamond.print(-2));
    }

    @Test
    public void testDiamond2() {
        assertEquals(null, GiveMeADiamond.print(2));
    }

    //My tests

    @Test
    public void testDiamond7(){
        StringBuffer expected = new StringBuffer();
        expected.append("   *\n");
        expected.append("  ***\n");
        expected.append(" *****\n");
        expected.append("*******\n");
        expected.append(" *****\n");
        expected.append("  ***\n");
        expected.append("   *\n");
        assertEquals(expected.toString(), GiveMeADiamond.print(7));
    }

    @Test
    public void testDiamond11(){
        StringBuffer expected = new StringBuffer();
        expected.append("     *\n");
        expected.append("    ***\n");
        expected.append("   *****\n");
        expected.append("  *******\n");
        expected.append(" *********\n");
        expected.append("***********\n");
        expected.append(" *********\n");
        expected.append("  *******\n");
        expected.append("   *****\n");
        expected.append("    ***\n");
        expected.append("     *\n");
        assertEquals(expected.toString(), GiveMeADiamond.print(11));
    }
}