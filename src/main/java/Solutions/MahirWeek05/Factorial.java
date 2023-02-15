package Solutions.MahirWeek05;

import java.util.stream.IntStream;

public class Factorial {
/*
Write a method that returns the factorial number of any given number
 */
    public static int factorial(int number){

        return IntStream.rangeClosed(1,number).reduce(1,(x, y)->x*y);
    }

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
}
