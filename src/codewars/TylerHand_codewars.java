package codewars;

public class TylerHand_codewars {
    //https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
    // This is how I learned how to use the StringBuilder class
    // tyler hand
    static String toCamelCase(String s){
        String camelCase = "";
        String[] words = s.split("[^a-zA-Z0-9]");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                sb.append(words[i]);
            } else {
                sb.append(words[i].substring(0, 1).toUpperCase() + words[i].substring(1));
            }
        }
        return sb.toString();
    }
}

