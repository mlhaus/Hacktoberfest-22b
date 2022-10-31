package codewars;

public class TribonacciSequence {

    /**
     * @link https://www.codewars.com/kata/556deca17c58da83c00002db/train/java
     * @author Andy
     * @param s the signature (first 3 elements) of the sequence to return.
     * @param n the number of elements to return.
     * @return a double array of the first n elements of the tribonacci sequence obtianed from the signature.
     */
    public double[] tribonacci(double[] s, int n) {
        double[] result = {}; // in my first attempt I declared result in the
        //                       else block, and the return statement could use it
        if(s.length != 3){
            throw new IllegalArgumentException("signature must be 3 long");
        } else if(n < 0){
            throw new IllegalArgumentException("n can not be negative");
        }else{
            result = new double[n];
            int lastIndex = n - 1;
            if(lastIndex <= 2){ // in an earlier attempt I did not have this inner if/else clause,
                //                 so setting the start of result to s would cause an error if n was less than 3.
                for(int j = 0; j <= lastIndex; j++){
                    result[j] = s[j];
                }
            } else{
                result[0] = s[0];
                result[1] = s[1];
                result[2] = s[2];
            }
            for(int i = 2; i < lastIndex; i++){
                double nextNumber = result[i - 2] + result[i - 1] + result[i];
                result[i + 1] = nextNumber;
            }
        }
        return result;
    }
}
