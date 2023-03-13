package Solutions.week05;

import java.util.Arrays;

/*
How to convert a positive int to an array of digits.

Input: 490 Output: [4, 9, 0] (as int Array)
 */
public class Q5_ArrayOfDigits {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(intToArr(490)));

    }

    public static int[] intToArr(int num) {

        String s = Integer.toString(num);

        int[] intArray = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            intArray[i] = Character.getNumericValue(s.charAt(i));
        }
        return intArray;
    }
}
