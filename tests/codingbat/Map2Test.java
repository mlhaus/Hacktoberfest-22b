package codingbat;

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
    void william_wordLen() {
        String[] strings = {"hello", "goodbye"};
        Map<String, Integer> result = Map2.wordLen(strings);
        assertTrue(result.containsValue(5));
        assertTrue(result.containsValue(7));
        assertFalse(result.containsValue(8));
        assertEquals(result.containsValue(5), result.containsValue(5));
        assertEquals(result.containsKey("hello"), result.containsKey("hello"));
    }

    @Test
    void april_wordCount(){
        String[] words = {"apple", "bee", "caramel", "dark", "bee", "elephant", "apple", "dark", "fog"};
        Map<String, Integer> result = Map2.wordCount(words);
        String[] expected = {"apple=2", "bee=2", "caramel=1", "dark=2", "elephant=1", "fog=1"};
        assertEquals(Arrays.toString(expected), result.toString().replaceAll("[{]", "[").replaceAll("[}]", "]"));
    }

    @Test
    void ethank_firstchar(){
        Map <String,String> map3 = new HashMap<>();
        map3.put("r","red2red");
        map3.put("b","blue2blue");
        map3.put("g","green");
        map3.put("y","yellow");

        String[] map2 = {"red2", "green","blue2","yellow","red","blue"};

        System.out.println( Map2.firstChar(map2));
        assertEquals(map3,Map2.firstChar(map2));
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


    
    @Test
    void mohmeed_firstSwap() {
        String[] strings = {"ab", "ac"};
        String[] result = Map2.firstSwap(strings);
        String[] expected = {"ac", "ab"};
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    void marwa_fistSwap() {
      // firstSwap(["ab", "ac"]) → ["ac", "ab"]
        String[] strings = {"ab", "ac"};
        String[] result = Map2.firstSwap(strings);
        String[] expected = {"ac", "ab"};
        assertTrue(Arrays.toString(expected).equals( Arrays.toString(result)));

    }

    // Test for wordLen()
    @Test
    void teft_wordLen() {
        String[] strings1 = {"one", "two", "one", "three", "two", "one"};
        Map<String, Integer> methodmap = Map2.wordLen(strings1);
        assertEquals(3, methodmap.get("one"));
        assertEquals(3, methodmap.get("two"));
        assertEquals(5, methodmap.get("three"));

        String[] strings2 = {"a", "two", "a", "two", "be", "be"};
        Map<String, Integer> methodmap2 = Map2.wordLen(strings2);
        assertEquals(1, methodmap2.get("a"));
        assertEquals(3, methodmap2.get("two"));
        assertEquals(2, methodmap2.get("be"));
    }

    @Test
    void alex_word0() {
        String[] strings = {"apple"};
        String result = Map2.word0(strings).toString();
        assertEquals(result, "{apple=0}");
    }

    @Test
    void andy_firstSwap() {
        // if no strings match
        String[] strings = {"cat", "dog", "bunny", "horse"};
        String[] result = Map2.firstSwap(strings);
        String[] expected = {"cat", "dog", "bunny", "horse"};
        assertEquals(Arrays.toString(expected), Arrays.toString(result));

        // if strings match only swap first two that start with a given letter
        String[] strings2 = {"cat", "hog", "cow", "caterpillar", "hamster", "coon", "horse", "Human"};
        String[] result2 = Map2.firstSwap(strings2);
        String[] expected2 = {"cow", "hamster", "cat", "caterpillar", "hog", "coon", "horse", "Human"};
        assertEquals(Arrays.toString(expected2), Arrays.toString(result2));
    } // andy_firstSwap end

    @Test
    void hoang_wordCount() {
        String[] strings = {"cat", "dog", "cat", "fish", "rabbit", "rabbit", "rabbit", "bird"};
        Map<String, Integer> map = Map2.wordCount(strings);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("cat", 2);
        expected.put("dog", 1);
        expected.put("fish", 1);
        expected.put("rabbit", 3);
        expected.put("bird", 1);
        assertTrue(expected.equals(map));

        Map<String, Integer> map2 = Map2.wordCount(strings);
        Map<String, Integer> expected2 = new HashMap<>();
        expected2.put("cat", 2);
        expected2.put("dog", 1);
        expected2.put("fish", 1);
        expected2.put("rabbit", 7);
        assertFalse(expected2.equals(map2));
    }


    @Test
    void abdalgader_wordAppend() {
        //wordAppend(["a", "b", "a"]) → "a"
        String[] strings1 = {"a", "b", "a"};
        String result1 = Map2.wordAppend(strings1);
        String expected1 = "a";
        assertEquals(result1,expected1);
    //wordAppend(["a", "b", "b", "a", "a"]) → "ba"

        String[] strings2 = {"a", "b", "b", "a", "a"};
        String result2 = Map2.wordAppend(strings2);
        String expected2 = "ba";
        assertTrue(result2.equals(expected2));

        String[] strings3 = {"a", "b", "b", "a", "a"};
        String result3 = Map2.wordAppend(strings3);
        String expected3 = "b";
        assertFalse(result3.equals(expected3));
    }


    @Test
    void chris_wordMultiple(){
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        String[] strings = {"a", "b", "c", "z", "b", "a", "h"};
        map = Map2.wordMultiple(strings);
        assertEquals(true, map.get("a"));
        assertEquals(false, map.get("z"));
        assertEquals(false, map.get("h"));
        assertNotEquals(true,map.get("c"));
    }



    @Test
    void matthew_word0() {
        String[] strings = {"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"};
        Map<String, Integer> result = Map2.word0(strings);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 0);
        assertEquals(expected, result);

        String[] strings1 = {"2", "5", "1"};
        Map<String, Integer> result2 = Map2.word0(strings);
        Map<String, Integer> expected2 = new HashMap<>();
        expected2.put("2", 0);
        expected2.put("5", 0);
        expected2.put("1", 0);
        assertTrue(expected2.containsKey("2"));
        assertTrue(expected2.containsKey("5"));
        assertTrue(expected2.containsKey("1"));
        assertTrue(expected2.containsValue(0));
    }
}
