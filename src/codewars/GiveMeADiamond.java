package codewars;

public class GiveMeADiamond {

    //@link https://www.codewars.com/kata/5503013e34137eeeaa001648/train/java
    //@author Nathan Zumsande

    public static String print(int n) {
        // TODO your code here
        if (n < 0 || n % 2 == 0) {
            return null;
        }
        if(n == 1){
            return "*\n";
        }
        String diamond = "";
        int totalspaces = -1;
        for (int numStars = 1; numStars <= n; numStars += 2) {
            totalspaces += 1;
        }
        for (int numStars = 1; numStars <= n; numStars += 2) {
            for(int j = 0; j < totalspaces; j++) {
                diamond += " ";
            }
            for (int i = 0; i < numStars; i++) {
                diamond += "*";
            }
            diamond += "\n";
            totalspaces--;
        }
        String spaces = "";
        for(int numStars = n - 2; numStars >= 1; numStars -= 2){
            spaces += " ";
            diamond += spaces;
            for (int i = 0; i < numStars; i++) {
                diamond += "*";
            }
            diamond += "\n";
        }

        return diamond;
    }
}




