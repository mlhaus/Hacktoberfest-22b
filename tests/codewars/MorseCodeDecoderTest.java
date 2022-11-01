package codewars;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class MorseCodeDecoderTest {

    @Test
    public void testBasicMorseDecoding() {
        assertEquals(MorseCodeDecoder.decode(".-"), "A");
        assertEquals(MorseCodeDecoder.decode("."), "E");
        assertEquals(MorseCodeDecoder.decode(".."), "I");
        assertEquals(MorseCodeDecoder.decode(". ."), "EE");
        assertEquals(MorseCodeDecoder.decode(".   ."), "E E");
        assertEquals(MorseCodeDecoder.decode("...---..."), "SOS");
        assertEquals(MorseCodeDecoder.decode("... --- ..."), "SOS");
        assertEquals(MorseCodeDecoder.decode("...   ---   ..."), "S O S");



    }

    @Test
    void testMoreComplexTests() {
        assertEquals(MorseCodeDecoder.decode(" . "), ("E"));
        assertEquals(MorseCodeDecoder.decode("   .   . "), ("E E"));
        assertEquals(MorseCodeDecoder.decode("      ...---... -.-.--   - .... .   --.- ..- .. -.-. -.-   -... .-. --- .-- -.   ..-. --- -..-   .--- ..- -- .--. ...   --- ...- . .-.   - .... .   .-.. .- --.. -.--   -.. --- --. .-.-.-  "), ("SOS! THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG."));
    }



    @Test
    void molly_decode() {
        assertEquals(MorseCodeDecoder.decode("- ..- .-. - .-.. ."), "TURTLE");
        assertEquals(MorseCodeDecoder.decode(" ..   .-.. .. -.- .   - ..- .-. - .-.. . ... -.-.--"), "I LIKE TURTLES!");
        assertFalse(MorseCodeDecoder.decode(".. -.-. .   -.-. .-. . .- --").equals("I LOVE ICE CREAM"));
    }
}