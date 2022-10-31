package codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.*;
//https://www.codewars.com/kata/585d7d5adb20cf33cb000235
public class FindTheUniqueNumber {
        public static double findUniq(double arr[]) {

            Set<Double> ayo = new HashSet<>();
            ArrayList<Double> list = new ArrayList<>();
            int count = 0;
            double uniqueNum = 0;
            for(Double b : arr) {
                list.add(b);
            }
            for(Double r : arr) {
                ayo.add(r);
            }
            for(Double num : ayo){
                count = Collections.frequency(list,num);
                if(count == 1){
                    uniqueNum = num;
                }
            }
            return uniqueNum;

        }
    }


