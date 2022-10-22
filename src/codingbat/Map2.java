package codingbat;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

    /*
     * Given an array of strings, return a Map<String, Integer> containing a key
     * for every different string in the array, always with the value 0. For
     * example the string "hello" makes the pair "hello":0. We'll do more
     * complicated counting later, but for this problem the value is simply 0.
     */
    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String str: strings) {
            map.put(str, 0);
        }
        return map;
    }

    /*
     * Given an array of strings, return a Map<String, Integer> containing
     * a key for every different string in the array, and the value is that
     * string's length.
     */
    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String str: strings) {
            map.put(str, str.length());
        }
        return map;
    }

    /*
     * Given an array of non-empty strings, create and return a
     * Map<String, String> as follows: for each string add its first
     * character as a key with its last character as the value.
     */
    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String str: strings) {
            map.put(str.substring(0,1), str.substring(str.length() - 1));
        }
        return map;
    }

    /*
     * The classic word-count algorithm: given an array of strings, return
     * a Map<String, Integer> with a key for each different string, with
     * the value the number of times that string appears in the array.
     */
    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(String str: strings) {
            if(map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        return map;
    }

    /*
     * Given an array of non-empty strings, return a Map<String, String> with
     * a key for every different first character seen, with the value of all
     * the strings starting with that character appended together in the
     * order they appear in the array.
     */
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for(String str: strings) {
            String firstCharacter = str.substring(0,1);
            if(map.containsKey(firstCharacter)) {
                map.put(firstCharacter, map.get(firstCharacter) + str);
            } else {
                map.put(firstCharacter, str);
            }
        }
        return map;
    }




    /*
     * Loop over the given array of strings to build a result string like
     * this: when a string appears the 2nd, 4th, 6th, etc. time in the
     * array, append the string to the result. Return the empty string if no
     * string appears a 2nd time.
     */
    public static String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        String result = "";
        for(String str: strings) {
            if(!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                map.put(str, map.get(str) + 1);
                if(map.get(str) % 2 == 0) {
                    result += str;
                }
            }
        }
        return result;
    }

    /*
     * Given an array of strings, return a Map<String, Boolean> where each
     * different string is a key and its value is true if that string appears
     * 2 or more times in the array.
     */
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Boolean> map2 = new HashMap<>();
        for(String str: strings) {
            if(map1.containsKey(str)) {
                map1.put(str, map1.get(str) + 1);
                if(map1.get(str) >= 2) {
                    map2.put(str, true);
                }
            } else {
                map1.put(str, 1);
                map2.put(str, false);
            }
        }
        return map2;
    }

    /*
     * We'll say that 2 strings "match" if they are non-empty and their first
     * chars are the same. Loop over and then return the given array of
     * non-empty strings as follows: if a string matches an earlier string
     * in the array, swap the 2 strings in the array. When a position in the
     * array has been swapped, it no longer matches anything. Using a map,
     * this can be solved making just one pass over the array. More difficult
     * than it looks.
     */
    public static String[] allSwap(String[] strings) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < strings.length; i++) {
            char firstChar = strings[i].charAt(0);
            if(map.containsKey(firstChar)) {
                String temp = strings[i];
                strings[i] = strings[map.get(firstChar)];
                strings[map.get(firstChar)] = temp;
                map.remove(firstChar);
            } else {
                map.put(firstChar, i);
            }
        }
        return strings;
    }


    /*
     * We'll say that 2 strings "match" if they are non-empty and their first
     * chars are the same. Loop over and then return the given array of
     * non-empty strings as follows: if a string matches an earlier string
     * in the array, swap the 2 strings in the array. A particular first char
     * can only cause 1 swap, so once a char has caused a swap, its later swaps
     * are disabled. Using a map, this can be solved making just one pass over
     * the array. More difficult than it looks.
     */
    public static String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < strings.length; i++) {
            String firstCharacter = strings[i].substring(0, 1);
            if(map.containsKey(firstCharacter)) {
                if(map.get(firstCharacter) != -1) {
                    String temp = strings[i];
                    strings[i] = strings[map.get(firstCharacter)];
                    strings[map.get(firstCharacter)] = temp;
                    map.put(firstCharacter, -1);
                }
            } else {
                map.put(firstCharacter, i);
            }
        }
        return strings;
    }


}
