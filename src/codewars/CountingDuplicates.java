package codewars;
// code original https://github.com/m652i/Codewars-JAVA/blob/master/%3C6%E7%B4%9A%3E%20Counting%20Duplicates.java
public class CountingDuplicates {
    static final int NO_CHARS = 256;
    public static int duplicateCount(String text) {
        // Write your code here

        int result = 0;
        int count[] = new int[NO_CHARS];
        for(int i = 0; i < text.length(); ++i){
            count[Character.toLowerCase(text.charAt(i))]++;
        }
        for (int i = 0; i < NO_CHARS; i++) {
            if(count[i] > 1) {
                result++;
            }
        }
        return result;
    }
}

