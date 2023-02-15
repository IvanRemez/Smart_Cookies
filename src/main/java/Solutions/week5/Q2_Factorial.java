package Solutions.week5;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Q2_Factorial {

    public static void main(String[] args) {

        System.out.println(FindFactorialNumber(6));

    }
    private static Long FindFactorialNumber (long n){
        return LongStream.rangeClosed(1,n).reduce((x, y)->x*y).getAsLong();
    }

}
/*
Question-2 Find Factorial

Write a method that returns the factorial number of any given number.

Factorial: Factorial of a non-negative integer, is multiplication of all positive integers
smaller than or equal to n. For example, factorial of 6 is 6*5*4*3*2*1 which is 720.
 */