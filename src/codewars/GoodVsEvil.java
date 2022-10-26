package codewars;

//https://www.codewars.com/kata/52761ee4cffbc69732000738

public class GoodVsEvil {
    String good;
    String evil;
    static int addGood(String s){
        int total = 0;
        String[] splitStr = (s.split(" "));
        Integer[] makeInt = {1, 2, 3, 3, 4, 10};
        int count = 0;
        for (String n  : splitStr){
            int x = Integer.parseInt(n);
            makeInt[count] = makeInt[count] * x;
            count++;
        }

        for (int n  : makeInt){
            total += n;
        }
        return total;
    }
    static int addEvil(String s){
        int total = 0;
        String[] splitStr = (s.split(" "));
        Integer[] makeInt = {1, 2, 2, 2, 3, 5, 10};
        int count = 0;
        for (String n  : splitStr){
            int x = Integer.parseInt(n);
            makeInt[count] = makeInt[count] * x;
            count++;
        }

        for (int n  : makeInt){
            total += n;
        }
        return total;
    }


    static String battle(String good, String evil) {
        int goodNum = addGood(good);
        int evilNum = addEvil(evil);

        String result;
        if(evilNum>goodNum){
            result =  ("Battle Result: Evil eradicates all trace of Good");
            return result;
        } else if (goodNum>evilNum) {
            result =  ("Battle Result: Good triumphs over Evil");
            return result;

        } else{
            result =  ("Battle Result: No victor on this battle field");
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(GoodVsEvil.battle("6711 5221 1717 7587 8900 172", "3658 4405 4638 3657 2079 310 7283"));
    }

}