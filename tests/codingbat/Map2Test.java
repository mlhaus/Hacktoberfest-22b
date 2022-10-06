package codingbat;

import codingbat.Map2;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static codingbat.Map2.wordLen;
import static org.junit.jupiter.api.Assertions.*;

class Map2Test {
    
    @Test
    void marc_allSwap() {
        String[] strings = {"cat", "dog", "bunny", "caterpillar", "kangaroo", "kitten", "butterfly", "crocodile", "centipede"};
        String[] result = Map2.allSwap(strings);
        String[] expected = {"caterpillar", "dog", "butterfly", "cat", "kitten", "kangaroo", "bunny", "centipede", "crocodile"};
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }
    @Test
    void ethanm_wordLen(){
        Map<String, Integer> result1 = new HashMap<>();
        result1.put("bb", 2);
        result1.put("a", 1);
        String[] stringArray1 = {"a", "bb", "a", "bb"};
        assertEquals(Map2.wordLen(stringArray1), result1);

        Map<String, Integer> result2 = new HashMap<>();
        result2.put("this", 4);
        result2.put("and", 3);
        result2.put("that", 4);
        String[] stringArray2 = {"this", "and", "that", "and"};
        assertTrue(Map2.wordLen(stringArray2).equals(result2));

        Map<String, Integer> result3 = new HashMap<>();
        result3.put("this", 4);
        result3.put("and", 3);
        String[] stringArray3 = {"this", "and", "that", "and"};
        assertFalse(Map2.wordLen(stringArray3).equals(result3));
    }
}