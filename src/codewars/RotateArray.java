package codewars;

public class RotateArray {

    /**
     * @link https://www.codewars.com/kata/5469e0798a3502f4a90005c9/train/java
     * @author Matthew Meppelink
     * @param data object to be roated
     * @param n the number of times to rotate 
     * @return the rotated object.
     */
    public Object[] rotate(Object[] data, int n) {
        if (n > 0) {
            for (int i = 0, j; i < n; i++) {
                Object last;
                last = data[data.length - 1];

                for (j = data.length - 1; j > 0; j--) {
                    data[j] = data[j - 1];
                }
                data[0] = last;
            }
        } else if (n < 0) {
            n = Math.abs(n);
            for (int i = 0, j; i < n; i++) {
                Object first;
                first = data[0];
                for (j = 0; j < data.length - 1; j++) {
                    data[j] = data[j + 1];
                }
                data[j] = first;
            }
        }

        return data;
    }
}
