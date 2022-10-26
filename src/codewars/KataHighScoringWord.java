package codewars;

public class KataHighScoringWord {
    //url: codewars.com/kata/57eb8fcdf670e99d9b000272
    public static String high(String s) {
        int maxscore = 0;
        String maxword = "";
        for (String word : s.split(" ")) {
            int score = 0;
            for (char c : word.toCharArray()) {
                score += c -96;
            }
            if (score > maxscore){
                maxscore = score;
                maxword = word;
            }
        }
        return maxword;
    }
}
