package Solutions.week7;

/*
Question-1 Missing Number

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
Example 1:
Input: nums = [3, 0, 1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0, 3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:
Input: nums = [0, 1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0, 2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:
Input: nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0, 9]. 8 is the missing number in the range since it does not appear in nums.

Constraints:
n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.

Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
Please, test your solution here: https://leetcode.com/problems/missing-number/
 */

import java.util.Arrays;

public class Q1_MissingNum {

    public static void main(String[] args) {
    
        //int[] nums = {3, 0, 1};
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        //int[] nums = {0,1};

        System.out.println(Oleksii_MissingNum(nums));
    
        int[] arr = {3, 0, 1};
        int[] arr2 = {0, 1};
        int[] arr3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber_Zehra(arr)); // 2
        System.out.println(missingNumber_Zehra(arr2)); // 2
        System.out.println(missingNumber_Zehra(arr3)); // 8


        int [] num = {0, 1};
        int [] num1 = {3, 0, 1};
        int [] num2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        System.out.println(MissingNumber_Sopo(num));
        System.out.println(MissingNumber_Sopo(num1));
        System.out.println(MissingNumber_Sopo(num2));

    }

    public static int MissingNumber_Sopo (int [] number){
        int n = number.length;
        int sum = n* (n+1)/2;

        for (int i = 0; i < n; i++) {
            sum -=number[i];

        }

        return sum;
    }

    static int Oleksii_MissingNum(int[] arr) {

        int k = ((arr.length ) * (arr.length+1)) / 2;

        for (int i = 0; i < arr.length; i++) {

            k -= arr[i];
        }
        return k;

    }
    
    public static int missingNumber_Zehra(int[] array) {

        int result = 0;

        int n = array.length;

        for (int each : array) {
            result += each;
        }

        int sumOfArray = n * (n + 1) / 2;

        if (result == sumOfArray) {
            return 0;
        } else {
            return sumOfArray - result;
        }
    }
}
