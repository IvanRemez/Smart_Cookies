package Solutions.week5;

import java.util.stream.IntStream;

/*
Question-2 Find Factorial

Write a method that returns the factorial number of any given number.

Factorial: Factorial of a non-negative integer, is multiplication of all positive integers
smaller than or equal to n. For example, factorial of 6 is 6*5*4*3*2*1 which is 720.
 */
public class Q2_Factorial {

    public static void main(String[] args) {

        System.out.println(factorialWithFor(6));

        System.out.println(factorialWithStream(6));

    }
    public static int factorialWithFor(int num) {

        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }

    public static int factorialWithStream(int num) {
        return IntStream.rangeClosed(1, num)
                .reduce(1, (a, b) -> a * b);
    }
}
