package codewars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheMissingLetterTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void findMissingLetter() {
        assertEquals('e', FindTheMissingLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', FindTheMissingLetter.findMissingLetter(new char[] { 'O','Q','R','S' }));
        assertEquals('L', FindTheMissingLetter.findMissingLetter(new char[] { 'H','I','J','K', 'M', 'N' }));
        assertEquals('g', FindTheMissingLetter.findMissingLetter(new char[] { 'a','b','c','d', 'e', 'f', 'h', 'i', 'j', 'k' }));
    }
}