package Solutions.MahirWeek05;

import java.util.Arrays;

public class PositiveIntegerToArray {
    /*
    How to convert a positive int to an array of digits.
     */
    public static int[] Convert(int number) {
        String numString = String.valueOf(number);
        int[] arr = new int[numString.length()];

        if (number > 0) {
            for (int i = 0; i < numString.length(); i++) {
                arr[i] = Integer.parseInt(numString.charAt(i) + "");
            }
        }else{
            System.err.println("Number is not possitive "+number);
            return new int[]{};
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Convert(-1525)));
    }
}
