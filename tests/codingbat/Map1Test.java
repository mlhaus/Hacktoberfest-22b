package codingbat;


import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import static codingbat.Map1.mapBully;
import static codingbat.Map1.topping1;
import static org.junit.jupiter.api.Assertions.*;

class Map1Test {

    @Test
    void marc_mapAB2() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "cat");
        map1.put("b", "cat");
        Map<String, String> map2 = Map1.mapAB2(map1);
        assertFalse(map2.containsKey("a"));
        assertFalse(map2.containsKey("b"));

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "cat");
        map3.put("b", "dog");
        Map<String, String> map4 = Map1.mapAB2(map3);
        assertTrue(map4.containsKey("a"));
        assertTrue(map4.containsKey("b"));

    }
    @Test
    void tylerb_mapAB3False(){
        Map<String, String> stuff = new HashMap<>();

        stuff.put("a", "test");
        stuff.put("a", "test");
        stuff.put("b", "something");
        Map<String, String> result = Map1.mapAB3(stuff);
        String wrong = "{a=test,a=test, b=something}";
        assertNotEquals(result.toString(), wrong);
    }

    @Test
    void john_topping3(){
        Map<String, String> map = new HashMap<>();
        map.put("potato","ranch");
        map.put("salad", "ceaser");
        Map<String, String> map1 = Map1.topping3(map);
        assertTrue(map1.containsKey("fries"));
        assertTrue(map1.containsKey("spinach"));
        assertEquals("ranch",map1.get("fries"));
        assertEquals("ceaser",map1.get("spinach"));

        Map<String, String> map2 = new HashMap<>();
        map2.put("corn","chicken");
        map2.put("orange", "sugar");
        Map<String, String> map3 = Map1.topping3(map2);
        assertFalse(map3.containsKey("fries"));
        assertFalse(map3.containsKey("spinach"));
    }

    @Test
    void gideon_mapBully() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "candy");
        map1=mapBully(map1);
        assertTrue(map1.containsKey("a"));
        assertTrue(map1.containsKey("b"));
        assertEquals("",map1.get("a"));
        assertEquals("candy",map1.get("b"));
        map1.put("a", "screamFest");
        map1=mapBully(map1);
        assertTrue(map1.containsKey("b"));
//        assertFalse(Boolean.parseBoolean("candy"),map1.get("b"));
//        assertFalse("candy",map1.get("b"));
    }
  
    @Test
    void rith_map_AB(){
        Map<String, String> map1 = new HashMap<>();
        map1.put("a","Hi");
        map1.put("b","There");
        Map<String, String> map2 = Map1.mapAB(map1);
        assertEquals("HiThere", map2.get("ab"));
        Map<String, String> map3 = new HashMap<>();
        map3.put("b","meh");
        map3.put("b","meh");
        Map<String, String> map4 = Map1.mapAB(map3);
        assertFalse(map4.containsKey("ab"));
    }


    @Test
    void tylerH_mapShare() {
        //tylerhand
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bbb");
        map1.put("c", "ccc");
        Map<String, String> map2 = Map1.mapShare(map1);
        Map<String, String> map3 = new HashMap<>();
        map3.put("b", "xyz");
        map3.put("c", "ccc");
        Map<String, String> map4 = Map1.mapShare(map3);
        assertTrue(map4.containsKey("b"));
        assertFalse(map4.containsKey("c"));

    }
    
    @Test
    void nathan_mapShare(){
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "a");
        map1.put("b", "b");
        map1.put("c", "c");
        Map<String, String> map2 = new HashMap<>();
        map2 = Map1.mapShare(map1);
        assertEquals("a", map2.get("b"));
        assertFalse(map2.containsKey("c"));

        Map<String, String> map3 = new HashMap<>();
        map3.put("b", "b");
        Map<String, String> map4 = new HashMap<>();
        map4 = Map1.mapShare(map3);
        assertEquals("b", map4.get("b"));

        Map<String, String> map5 = new HashMap<>();
        map5.put("a", "a");
        Map<String, String> map6 = new HashMap<>();
        map6 = Map1.mapShare(map5);
        assertTrue(map6.containsKey("b"));
        assertEquals("a", map6.get("b"));
    }

    @Test
    void zaid_topping1(){
        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "");
        map1.put("bread", "");
        Map<String, String> map2 = Map1.topping1(map1);
        assertTrue(map2.get("ice cream").equals("cherry"));
        assertTrue(map2.get("bread").equals("butter"));
        assertEquals("butter", map2.get("bread"));
        assertEquals("cherry", map2.get("ice cream"));

        Map<String, String> map3 = new HashMap<>();
        map3.put("ice cream", "");
        map3.put("bread", "");
        Map<String, String> map4 = Map1.topping1(map3);
        assertFalse(map4.get("ice cream").equals(""));
        assertFalse(map4.get("bread").equals(""));
    }
    
    @Test
    void stephen_mapAB3() {
        HashMap<String,String> firstMap = new HashMap<>();
        firstMap.put("a","Test Value");
        firstMap.put("d","I'm Cool");
        Map<String, String> testOneMap = Map1.mapAB3(firstMap);
        assertEquals("Test Value",testOneMap.get("a"));
        assertEquals("Test Value",testOneMap.get("b"));
        assertEquals("I'm Cool",testOneMap.get("d"));


        HashMap<String,String> secondMap = new HashMap<>();
        secondMap.put("a","Test Value");
        secondMap.put("b","Woot Woot");
        secondMap.put("c","You're Cool");
        Map<String, String> testTwoMap = Map1.mapAB3(secondMap);
        assertEquals("Test Value",testTwoMap.get("a"));
        assertEquals("Woot Woot",testTwoMap.get("b"));
        assertEquals("You're Cool",testTwoMap.get("c"));
    }

    @Test
    void william_mapBully() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "f");
        map1.put("b", "c");
        Map<String, String> map2 = Map1.mapBully(map1);
        assertTrue(map2.containsValue(""));
        assertFalse(map2.containsValue("c"));

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "f");
        map3.put("b", "c");
        Map<String, String> map4 = Map1.mapBully(map3);
        assertEquals(map4.containsValue(""), map4.containsKey("a"));
        assertEquals(map4.containsValue("f"), map4.containsKey("b"));

    }

    @Test
    void william_mapBully() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "f");
        map1.put("b", "c");
        Map<String, String> map2 = Map1.mapBully(map1);
        assertTrue(map2.containsValue(""));
        assertFalse(map2.containsValue("c"));

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "f");
        map3.put("b", "c");
        Map<String, String> map4 = Map1.mapBully(map3);
        assertEquals(map4.containsValue(""), map4.containsKey("a"));
        assertEquals(map4.containsValue("f"), map4.containsKey("b"));

    }

    @Test
    void april_mapAB(){
        Map<String, String> map1 = new HashMap<>();
        map1.put ("a" , "a");
        map1.put ("b" , "b");
        Map<String, String> map2 = Map1.mapAB(map1);
        assertTrue(map2.containsKey("ab"));
        assertTrue(map2.containsKey("a"));
        assertTrue(map2.containsKey("b"));
        assertFalse(map2.containsKey("c"));

        Map<String, String> map3 = new HashMap<>();
        map3.put ("a", "a");
        map3.put ("c", "c");
        Map<String, String> map4 = Map1.mapAB(map3);
        assertTrue(map4.containsKey("a"));
        assertTrue(map4.containsKey("c"));
        assertFalse(map4.containsKey("ab"));

    }

    @Test
    void ethank_topping2(){
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "cat");
        map1.put("b", "cat");

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "cat");
        map2.put("b", "cat");
        Map1.topping2(map1);
        assertEquals(map1, map2);


        map1.put("ice cream", "");
        assertFalse(map1.containsKey("yogurt"));
        Map1.topping2(map1);
        assertFalse(map1.containsKey("yogurt"));

        map1.put("ice cream", "42");
        Map1.topping2(map1);
        assertTrue(map1.containsKey("yogurt"));

        Map<String, String> map3 = new HashMap<>();
        map3.put("spinach","rats");
        Map1.topping2(map3);
        assertEquals(map3.get("spinach") , "nuts");
//i fixed topping 2
    }


    @Test
    void ethanm_topping1() {
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();
        map1.put("ice cream", "peanuts");
        map2.put("bread", "butter");
        map2.put("ice cream", "cherry");
        assertEquals(topping1(map1) , map2);

        Map<String, String> map3 = new HashMap<>();
        Map<String, String> map4 = new HashMap<>();
        map4.put("bread", "butter");
        assertEquals(topping1(map3) , map4);

        Map<String, String> map5 = new HashMap<>();
        Map<String, String> map6 = new HashMap<>();
        map6.put("bread", "");
        assertFalse(topping1(map5).equals(map6));

        Map<String, String> map7 = new HashMap<>();
        Map<String, String> map8 = new HashMap<>();
        map7.put("pancake", "syrup");
        map8.put("bread", "butter");
        map8.put("pancake", "syrup");
        assertTrue(topping1(map7).equals(map8));

    }

    @Test
    void andy_mapAB4(){
        // Check A longer
        Map<String, String> mapToPassIn1 = new HashMap<>();
        mapToPassIn1.put("a", "a is longer");
        mapToPassIn1.put("b", "short");
        Map<String, String> returnedMap = Map1.mapAB4(mapToPassIn1);
        assertEquals("a is longer", returnedMap.get("a"));

        // Check B longer
        Map<String, String> mapToPassIn2 = new HashMap<>();
        mapToPassIn2.put("a", "a short");
        mapToPassIn2.put("b", "b is longer this time");
        Map<String, String> returnedMap2 = Map1.mapAB4(mapToPassIn2);
        assertEquals("b is longer this time", returnedMap2.get("c"));

        // Check same length
        Map<String, String> mapToPassIn3 = new HashMap<>();
        mapToPassIn3.put("a", "same length");
        mapToPassIn3.put("b", "length same");
        mapToPassIn3.put("c", "c stays");
        Map<String, String> returnedMap3 = Map1.mapAB4(mapToPassIn3);
        assertEquals("", returnedMap3.get("a"));
        assertEquals("", returnedMap3.get("b"));
        assertEquals("c stays", returnedMap3.get("c"));

        // a or b does not exist
        Map<String, String> mapToPassIn4 = new HashMap<>();
        mapToPassIn4.put("a", "no b");
        mapToPassIn4.put("c", "c stays");
        Map<String, String> returnedMap4 = Map1.mapAB4(mapToPassIn4);
        assertEquals("no b", returnedMap4.get("a"));
        assertEquals("c stays", returnedMap4.get("c"));
    } // andy_mapAB4 end


    @Test
    void chris_topping1(){
        Map<String, String> map3 = new HashMap<>();
        map3.put("ice cream", "peanuts");
        Map<String, String> map4 = Map1.topping1(map3);
        assertTrue(map4.containsKey("bread"));
        assertEquals(map4.get("ice cream"), "cherry");


        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "peanuts");
        map1.put("b", "cat");
        Map<String, String> map2 = Map1.topping1(map1);
        assertNotEquals(map2.get("icecream"), "peanuts");
    }


    @Test
    void matthew_mapAB() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "Hello");
        map1.put("b", "Hi");
        Map<String, String> map2 = Map1.mapAB(map1);
        assertTrue(map2.containsKey("ab"));
        assertTrue(map2.containsValue("HelloHi"));

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "Asdf");
        map3.put("b", "Asdf");
        Map<String, String> map4 = Map1.mapAB(map3);
        map4.put("ab", "AsdfAsdf");
        assertEquals(map4, map3);

    }


   @Test
   void abdalgader_mapAB4(){
        //mapAB4({"a": "aaa"}) → {"a": "aaa"}
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        Map<String, String> expected1 = new HashMap<>();
        expected1.put("a", "aaa");
        assertEquals(Map1.mapAB4(map1),expected1);

        //mapAB4({"a": "a", "b": "b", "c": "cake"}) → {"a": "", "b": "", "c": "cake"}
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "a");
        map2.put("b", "b");
        map2.put("c", "cake");
        Map<String, String> expected2 = new HashMap<>();
        expected2.put("a", "");
        expected2.put("b", "");
        expected2.put("c", "cake");
        assertTrue(Map1.mapAB4(map2).equals(expected2));


        //mapAB4({"a": "a", "b": "b", "c": "cake"}) → {"a": "", "b": "", "c": "cake"}
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "a");
        map3.put("b", "b");
        map3.put("c", "cake");
        Map<String, String> expected3 = new HashMap<>();
        expected3.put("a", "");
        //expected3.put("b", "");
        expected3.put("c", "cake");
        assertFalse(Map1.mapAB4(map3).equals(expected3));

        // mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}

        Map<String, String> map4 = new HashMap<>();
        map4.put("a", "aa");
        map4.put("b", "bbb");
        Map<String, String> expected4 = new HashMap<>();
        expected4.put("a", "aa");
        expected4.put("b", "bbb");
        expected4.put("c", "bbb");
        assertEquals(Map1.mapAB4(map4),expected4);
    }



    @Test
    void hoang_mapAB() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "hoang");
        map1.put("b", "chu");
        Map<String, String> map2 = Map1.mapAB(map1);
        assertTrue(map2.containsKey("ab"));
        assertEquals("hoangchu", map2.get("ab"));

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "hello");
        map3.put("c", "world");
        Map<String, String> map4 = Map1.mapAB(map3);
        assertFalse(map4.containsKey("ab"));
    }


    @Test
    void mohmeed_topping1() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "cherry");
        map1.put("bread", "butter");
        Map<String, String> map2 = Map1.topping1(map1);
        assertTrue(map2.containsValue("cherry"));
        assertTrue(map2.containsValue("butter"));
    }


    @Test
    void marwa_mapShare() {
        // mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}




        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bbb");
        map1.put("c","ccc");
        Map<String, String> expected = new HashMap<>();
        expected.put("a","aaa");
        expected.put("b","aaa");
        Map<String, String> result = Map1.mapShare(map1);
        assertEquals(expected,result);
        assertTrue(expected.equals(result));

    }

    // Test for mapAB4()
    @Test
    void teft_mapAB4() {
        Map<String, String> testmap = new HashMap<>();
        testmap.put("a", "longer");
        testmap.put("b", "short");
        Map<String, String> methodmap = Map1.mapAB4(testmap);
        assertTrue(methodmap.containsKey("c"));
        assertEquals("longer", methodmap.get("c"));
        assertEquals(methodmap.get("c"), (methodmap.get("a")));

        Map<String, String> testmap2 = new HashMap<>();
        testmap2.put("a", "short");
        testmap2.put("b", "longer");
        Map<String, String> methodmap2 = Map1.mapAB4(testmap2);
        assertTrue(methodmap2.containsKey("c"));
        assertEquals("longer", methodmap2.get("c"));
        assertEquals(methodmap2.get("c"), (methodmap2.get("b")));

        Map<String, String> testmap3 = new HashMap<>();
        testmap3.put("a", "same");
        testmap3.put("b", "same");
        Map<String, String> methodmap3 = Map1.mapAB4(testmap3);
        assertFalse(methodmap3.containsKey("c"));
        assertEquals("", methodmap3.get("a"));
        assertEquals("", methodmap3.get("b"));
    }

    @Test
    void alex_mapAB() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "apple");
        map1.put("b", "oranges");
        Map<String, String> map2 = Map1.mapAB(map1);
        assertFalse(map2.isEmpty());

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "apple");
        map3.put("b", "oranges");
        Map<String, String> map4 = Map1.mapAB(map3);
        assertTrue(map4.containsKey("ab"));


    }

    @Test
    void gwen_mapBully() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "cookie");
        map.put("b", "");
        Map1.mapBully(map);
        assertEquals("", map.get("a"));
        assertEquals("cookie", map.get("b"));

        assertTrue("".equals(map.get("a")));
        assertTrue("cookie".equals(map.get("b")));

    }

    @Test
    void molly_mapAB3() {

        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "blue");
        Map<String, String> map2 = Map1.mapAB3(map1);
        assertTrue(map2.get("b").equals(map2.get("a")));


        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "purple");
        map3.put("b", "green");
        Map<String, String> map4 = Map1.mapAB3(map3);
        assertFalse(map4.get("b").equals(map4.get("a")));
    }

}