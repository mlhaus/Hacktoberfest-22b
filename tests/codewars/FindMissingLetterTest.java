package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMissingLetterTest {

    @Test
    void findMissingLetter() {
        assertEquals('e', FindMissingLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', FindMissingLetter.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }
}