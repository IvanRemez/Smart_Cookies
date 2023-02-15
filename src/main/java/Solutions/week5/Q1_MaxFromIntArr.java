package Solutions.week5;

import java.util.Arrays;

/*
Question-1 Find Max from int Array

Write a function that can find the maximum number from an int Array.

input: int[] array = {6, 8, 3, 5, 1, 9}; output: 9
 */

public class Q1_MaxFromIntArr {

    public static void main(String[] args) {

        int[] array = {6, 8, 3, 5, 1, 9};
        System.out.println(  ( FindMaxNumber_Sopio(array) )   );


    }
    public static int FindMaxNumber_Sopio (int [] x){
        int num = 0;
        for (int each : x){
            if (each>num){
                num=each;
            }
        }

        return num;
    }
}
