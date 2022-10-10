package codewars;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    //    https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java
    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : a) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }
        return 0;
    }
}