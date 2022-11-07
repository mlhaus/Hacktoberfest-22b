package codewars;

public class Prime {
    public static boolean isPrime(int num) {
        int i = 2;
        boolean result = false;
        if(num < 2){return result = false;}
        if(num == 2 || num == 3 || num == 5 || num == 7){return result = true;}

        while( i <= num/2){
            if(num % i == 0){return result = false;}
            i++;
        }
        if( i == (num/2 + 1)){return result =  true;}
        return result;
    }
}
