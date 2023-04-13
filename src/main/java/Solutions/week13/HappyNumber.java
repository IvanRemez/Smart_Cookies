package Solutions.week13;
/*
Question-2 Happy Number

Write a function that returns true if a number is a happy number, and false if it is an unhappy number.
A happy number is a number defined by the following process:

1. Starting with any positive integer, replace the number by the sum of the squares of its digits.
2. Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which
does not include 1.
3. Those numbers for which this process ends in 1 are happy.

Example 1:
Input: n = 19 Explanation:
19 is Happy Number,
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
Output: True
1^2 + 0^2 + 0^2 = 1
As we reached to 1, 19 is a Happy Number.

Example 2:
Input: n = 20 Output: False

Constraints: 1 <= n <= 2^31 - 1

Please, try to test your solution via JUnit and also test your solution here:
https://leetcode.com/problems/happy-number/
For more explanation about happy number : https://en.wikipedia.org/wiki/Happy_number
 */

import java.util.HashSet;

public class HappyNumber {

    public static void main(String[] args) {

        // TEST HERE
        System.out.println(isHappy_Zehra(2)); // false
        System.out.println(isHappy_Zehra(19)); // true

    }

    // SOLUTIONS HERE
    public static boolean isHappy_Zehra(int n) {
        // first squares and sum of them while n > 0, if the result = 1, then true

        HashSet<Integer> set = new HashSet<>();

        while (!set.contains(n)) {
            set.add(n);
            int sumOfSquares = 0;

            while (n > 0) {
                sumOfSquares += Math.pow(n % 10, 2);
                n = n / 10;
            }
            n = sumOfSquares;
        }
        return n == 1 ? true : false;
    }

}
