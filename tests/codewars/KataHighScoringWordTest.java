package codewars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataHighScoringWordTest {

    @Test
    void high() {
        assertEquals("taxi", KataHighScoringWord.high("man i need a taxi up to ubud"));
        assertEquals("volcano", KataHighScoringWord.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", KataHighScoringWord.high("take me to semynak"));
        assertEquals("aa", KataHighScoringWord.high("aa b"));
        assertEquals("b", KataHighScoringWord.high("b aa"));
        assertEquals("bb", KataHighScoringWord.high("bb d"));
        assertEquals("d", KataHighScoringWord.high("d bb"));
        assertEquals("aaa", KataHighScoringWord.high("aaa b"));
        assertEquals("y",KataHighScoringWord.high("r o y g b i v"));
        assertEquals("yellow",KataHighScoringWord.high("red green blue yellow"));
    }
}