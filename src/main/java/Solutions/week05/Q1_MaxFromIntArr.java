package Solutions.week05;

import java.util.Arrays;

/*
Question-1 Find Max from int Array

Write a function that can find the maximum number from an int Array.

input: int[] array = {6, 8, 3, 5, 1, 9}; output: 9
 */

public class Q1_MaxFromIntArr {

    public static void main(String[] args) {

        int[] array = {6, 8, 3, 5, 1, 9};

        System.out.println(maxFromArr_Ivan(array));

        System.out.println(maxFromArr_Kicchi(array));

    }
    public static int maxFromArr_Ivan(int[] arr) {

        return Arrays.stream(arr).max().getAsInt();
    }

    public static int maxFromArr_Kicchi(int[] arr) {

        return Arrays.stream(arr).max().getAsInt();
    }


   public static int maxFromArr_Sef(int[] arr){   //practicing commit&push with Ivan
       return Arrays.stream(arr).max().getAsInt();
   }
}
