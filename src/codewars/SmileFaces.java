package codewars;

import java.util.List;

public class SmileFaces {
    public static int countSmileys(List<String> arr) {
        int count = 0;
        for (String str : arr) {
            if (str.length() <= 3) {
                char eyes = str.charAt(0);
                char mouth = str.charAt(str.length() - 1);
                char nose = '-';
                if (str.length() == 3) {
                    nose = str.charAt(1);
                }
                if (eyes == '-' || eyes == ':') {
                    if (mouth == ')' || mouth == 'D') {
                        if (nose == '-' || nose == '~') {
                            count++;
                        }
                    }
                }
            }
        }
        return count;

    }
}