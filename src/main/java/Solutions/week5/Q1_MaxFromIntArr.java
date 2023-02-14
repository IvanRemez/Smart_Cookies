package Solutions.week5;

import java.util.Arrays;

public class Q1_MaxFromIntArr {

    public static void main(String[] args) {

        int[] array = {6, 8, 3, 5, 1, 9};

        System.out.println(maxFromArr(array));

    }
    public static int maxFromArr(int[] arr) {

        return Arrays.stream(arr).max().getAsInt();
    }
}
/*
Question-1 Find Max from int Array

Write a function that can find the maximum number from an int Array.

input: int[] array = {6, 8, 3, 5, 1, 9}; output: 9
 */