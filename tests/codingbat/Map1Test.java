package codingbat;

import codingbat.Map1;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

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

}