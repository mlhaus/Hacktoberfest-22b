package codewars;

public class WriteNumbersInExpandedForm {
        /**
         * @link https://www.codewars.com/kata/5842df8ccbd22792a4000245/train/java
         * @author Rith
         * @param the number to be written in expanded form
         * @return the number written in expanded form
         */
        public static String expandedForm(int num)
        {
            String str = String.valueOf(num);
            String exp = "";
            for(int i=0;i<str.length();i++){
                int digit = Integer.parseInt(str.substring(i,i+1));
                if(digit== 0){
                    continue;
                }
                int place = str.length()-i-1;
                int value = (int) (digit*(Math.pow(10, place)));
                if(i!= 0)
                {
                    exp = exp + " + ";
                }
                exp = exp + value;
            }
            return exp;
        }

    }
