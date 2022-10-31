package codewars;

public class PangramChecker {
    /**
     * @link https://www.codewars.com/kata/545cedaa9943f7fe7b000048
     * @author Alex O
     * @additionalResourcesUsedForThisAssignment https://www.programiz.com/java-programming/library/string/contains
     * // https://docs.oracle.com/javase/7/docs/api/java/lang/String.html (scroll to Contains)
     * // https://www.youtube.com/watch?v=vZm0lHciFsQ
     */

        public boolean check(String sentence) {
            String lower = sentence.toLowerCase();
            for (char i = 'a'; i <= 'z'; i++) {
                if (!lower.contains(i + "")) {
                    return false;
                }
            } return true;
        }
    }