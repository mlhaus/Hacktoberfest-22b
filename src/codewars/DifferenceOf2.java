package codewars;
import java.util.*;

public class DifferenceOf2 {
    /**
     * @link https://www.codewars.com/kata/5340298112fa30e786000688/train/java
     * @author Chris
     * @return All pairs of integers from a given array that have a difference of 2
     */



        public static int[][] twosDifference(int[] array) {
            Arrays.sort(array);

            List<int[]> list = new ArrayList<>();

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if(array[i] - array[j] == 2 ) {
                        list.add(new int[] {array[j],array[i]});
                    }
                }
            }
            int[][] finalList = new int[list.size()][2];
            return  list.toArray(finalList);
        }
    }

