package codewars;

import java.util.Arrays;

public class FindMissingLetter {
    public static char findMissingLetter(char[] array)
    {
        int preLetter = 0;
        char missingLetter = ' ';
        Arrays.sort(array);
        for (char letter : array) {

            // int curLetter = (int)letter < 97 ? (int)letter + 32 : (int)letter; // make all the letter in the array to lowercase
            int curLetter = (int)letter;

            if (preLetter == 0) {
                preLetter = curLetter;
                continue;
            } else {
                if (curLetter - 1 != preLetter) {
                    missingLetter = (char)(curLetter-1);
                    break;
                }
                else {
                    preLetter = curLetter;
                }
            }
        }
        return missingLetter;
    }

}
