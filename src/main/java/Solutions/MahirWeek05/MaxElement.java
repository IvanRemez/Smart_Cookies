package Solutions.MahirWeek05;

import java.util.Arrays;

public class MaxElement {
    /*
    Write a function that can find the maximum number from an int Array.
     */
    public static int maxElementFromArray(int[] arr) {


        return Arrays.stream(arr).reduce(Integer::max).getAsInt();
    }

    public static void main(String[] args) {

        System.out.println(maxElementFromArray(new int[]{6, 8, 3, 5, 1, 9}));
    }
}
