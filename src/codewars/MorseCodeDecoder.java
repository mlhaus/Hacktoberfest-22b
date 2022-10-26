package codewars;

import java.util.HashMap;
import java.util.Map;

/*  Link: https://www.codewars.com/kata/54b724efac3d5402db00065e/train/java
    Challenge: Your task is to implement a function that would take the morse code as input and return a decoded human-readable string.
*/


class MorseCodeDecoder {
    public static String decode(String morseCode) {

        Map<String, String> MorseCode = new HashMap<>();  // codewars has a dictionary preloaded, got this here https://stackoverflow.com/questions/55192241/converting-morse-code-to-english-dictionary-words
        MorseCode.put(".-", "A");
        MorseCode.put("-...", "B");
        MorseCode.put("-.-.", "C");
        MorseCode.put("-..", "D");
        MorseCode.put(".", "E");
        MorseCode.put("..-.", "F");
        MorseCode.put("--.", "G");
        MorseCode.put("....", "H");
        MorseCode.put("..", "I");
        MorseCode.put(".---", "J");
        MorseCode.put("-.-", "K");
        MorseCode.put(".-..", "L");
        MorseCode.put("--", "M");
        MorseCode.put("-.", "N");
        MorseCode.put("---", "O");
        MorseCode.put(".--.", "P");
        MorseCode.put("--.-", "Q");
        MorseCode.put(".-.", "R");
        MorseCode.put("...", "S");
        MorseCode.put("-", "T");
        MorseCode.put("..-", "U");
        MorseCode.put("...-", "V");
        MorseCode.put(".--", "W");
        MorseCode.put("-..-", "X");
        MorseCode.put("-.--", "Y");
        MorseCode.put("--..", "Z");
        MorseCode.put("...---...", "SOS");
        MorseCode.put(".-.-.-", ".");
        MorseCode.put("-.-.--", "!");


        String decoded = "";
        String[] morseWords = morseCode.trim().split("   ");


        for(int i = 0; i < morseWords.length; i++) {
            String[] word = morseWords[i].split(" ");

            for(int j = 0; j < word.length; j++) {
                decoded += MorseCode.get(word[j]);
            }

            if(i == morseWords.length-1) {      // https://stackoverflow.com/questions/47621271/removing-space-after-last-element
                break;
            } else {
                decoded += " ";
            }
        }
        return decoded;
    }
}


// help with splitting the string correctly to not get a null before the result if there was less than
// 2 words in the string
//https://stackoverflow.com/questions/63488382/checking-if-there-is-whitespace-between-two-elements-in-a-string
