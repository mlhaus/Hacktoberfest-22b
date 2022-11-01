package codewars;

public class SortTheOdd {

    /**
     * @link https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/train/java
     * @author John Morris
     * @param array an array of integers.
     * @return the array with the odd numbers sorted and the even numbers left alone.
     */
    public static int[] sortArray(int[] array) {

            for(int i = 0; i < array.length; i++){
                for(int j = 0; j < array.length; j++){
                    if(array[j] % 2 != 0){
                        for (int k = j + 1; k < array.length; k++) {
                            if (array[k] % 2 != 0) {
                                if (array[j] > array[k]) {
                                    int temp = array[j];
                                    array[j] = array[k];
                                    array[k] = temp;
                                }
                                break;
                            }
                        }

                    }


                }
            }

            return array;
        }

}
