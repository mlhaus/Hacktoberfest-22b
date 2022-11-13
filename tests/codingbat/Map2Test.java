package codingbat;

import codegym.OurLinkedList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static codingbat.Map1.mapBully;
import static codingbat.Map2.wordCount;
import static codingbat.Map2.wordLen;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Map2Test {

    @Test
    void marc_allSwap() {
        String[] strings = {"cat", "dog", "bunny", "caterpillar", "kangaroo", "kitten", "butterfly", "crocodile", "centipede"};
        String[] result = Map2.allSwap(strings);
        String[] expected = {"caterpillar", "dog", "butterfly", "cat", "kitten", "kangaroo", "bunny", "centipede", "crocodile"};
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    void tylerb_wordLenTrue(){
        String[] strings = {"One", "Seven", "Four","Testing"};
        Map<String, Integer> result = Map2.wordLen(strings);

        String excpected = "{One=3, Four=4, Seven=5, Testing=7}";
        assertEquals(result.toString(), excpected);
    }

    
    @Test
    void tylerH_wordLen() {
        //
        String[] strings = {"a", "bb", "a", "bb"};
        Map2.wordLen(strings);
        assertEquals(2, Map2.wordLen(strings).get("bb"));
        assertEquals(1, Map2.wordLen(strings).get("a"));
        assertTrue(Map2.wordLen(strings).containsKey("bb"));
        assertTrue(Map2.wordLen(strings).containsKey("a"));
    }

    @Test
    void zaid_pairs(){
        String[] strings = {"Hello", "There"};
        Map<String, String> results = Map2.pairs(strings);
        Map<String, String> expected = new HashMap<>();
        expected.put("H","o");
        expected.put("T","e");
        assertEquals(expected.toString(), results.toString());
        assertTrue(expected.equals(results));

        String[] strings2 = {"Taco", "136"};
        Map<String, String> result2 = Map2.pairs(strings2);
        Map<String, String> expected2 = new HashMap<>();
        expected2.put("T","o");
        expected2.put("1","6");
        assertEquals(expected2.toString(), result2.toString());










    }

    @Test
    void gwen_pairs() {
        String[] namesWithLastInitial = {"GwenA", "StephenJ", "JaymesV"};
        Map<String, String> initials = Map2.pairs(namesWithLastInitial);
        assertEquals("A", initials.get("G"));
        assertEquals("J", initials.get("S"));
        assertEquals("V", initials.get("J"));
    }
    
    

    @Test
    void rith_wordCount() {
        String[] strings = {"cat", "dog", "bunny", "cat", "bunny", "cat"};
        Map<String, Integer> result = Map2.wordCount(strings);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("cat",3);
        expected.put("dog",1);
        expected.put("bunny",2);
        assertEquals(expected, result);
        assertTrue(result.get("cat")==3);
    }

  @Test
    void stephen_wordMultiple() {
        String[] words = new String[] {"Hi", "Hello", "Hola", "Hi"};
        Map<String,Boolean> moreThanOne = Map2.wordMultiple(words);

        assertTrue(moreThanOne.get("Hi"));
        assertFalse(moreThanOne.get("Hola"));


        String[] words2 = new String[] {"Hi", "Hello", "Hola","Howdy","Hola", "Hi"};

        Map<String,Boolean> moreThanOne2 = Map2.wordMultiple(words2);
        assertTrue(moreThanOne2.get("Hi"));
        assertTrue(moreThanOne2.get("Hola"));
        assertFalse(moreThanOne2.get("Howdy"));
    }
  
    @Test
    void john_firstSwap(){
        String[] str = {"goat","bat","john","bart","george", "kaitlyn","box"};
        String[] result = Map2.firstSwap(str);
        String[] expected = {"george","bart","john","bat","goat","kaitlyn","box"};
        assertEquals(Arrays.toString(expected),Arrays.toString(result));
        assertTrue(result[2].equals("john"));
        assertTrue(result[5].equals("kaitlyn"));
        assertTrue(result[6].equals("box"));

    }

    @Test
    void william_wordLen() {
        String[] strings = {"hello", "goodbye"};
        Map<String, Integer> result = Map2.wordLen(strings);
        assertEquals(5, result.get("hello"));
        assertEquals(7, result.get("goodbye"));
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
    void nathan_wordLen(){
        String[] strings = {"cat", "dog", "bunny", "caterpillar", "kangaroo", "Cat", "cat"};
        Map<String, Integer> map1 = new HashMap<>();
        map1 = Map2.wordLen(strings);
        assertEquals(3, map1.get("cat"));
        assertEquals(3, map1.get("dog"));
        assertEquals(5, map1.get("bunny"));
        assertEquals(11, map1.get("caterpillar"));
        assertEquals(8, map1.get("kangaroo"));
        assertEquals(3, map1.get("Cat"));
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
        //Good test
        String[] strings = {"cat", "dog", "cat", "fish", "rabbit", "rabbit", "rabbit", "bird"};
        Map<String, Integer> map = Map2.wordCount(strings);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("cat", 2);
        expected.put("dog", 1);
        expected.put("fish", 1);
        expected.put("rabbit", 3);
        expected.put("bird", 1);
        assertTrue(expected.equals(map));


        //Bad test
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

        // wordAppend(["this", "or", "that", "and", "this", "and", "that"]) → "thisandthat"

        String[] strings4 = {"this", "or", "that", "and", "this", "and", "that"};
        String result4 = Map2.wordAppend(strings4);
        String expected4 = "thisandthat";
        assertTrue(result4.equals(expected4));
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

    @Test
    void gideon_wordCount() {
        Map<String, Integer> map = new HashMap<>();
        String[] strings = {"a", "b", "a", "c", "b"};
        map=wordCount(strings);
        assertTrue(map.containsKey("a"));
        assertTrue(map.containsKey("b"));
        assertTrue(map.containsKey("c"));
        assertEquals(2,map.get("a"));
        assertEquals(2,map.get("b"));
        assertEquals(1,map.get("c"));
        assertFalse(map.containsKey("d"));
//        assertFalse(2,map.get("c"));
    }

    @Test
    void molly_wordLen() {
        String[] strings = {"red", "orange", "yellow", "green", "blue", "purple"};
        Map<String, Integer> map = new HashMap<>();
        map.put("red", 3);
        map.put("orange", 6);
        map.put("yellow", 6);
        map.put("green", 5);
        map.put("blue", 4);
        map.put("purple", 6);
        Map<String, Integer> resultMap = Map2.wordLen(strings);

        assertTrue(map.equals(resultMap));
        assertEquals(resultMap.get("red"), map.get("red"));
        assertFalse(map.containsValue(2));
    }

    @Test
    void toney_word0() {
        String[] map = {"a", String.valueOf(1),"b", String.valueOf(2)};

        Map<String, Integer> results = Map2.word0(map);
        assertTrue(results.containsKey("a"));
        assertFalse(results.containsValue(1));
    }
}
