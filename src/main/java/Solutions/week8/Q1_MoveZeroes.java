package Solutions.week8;

/*
Question-1 Move Zeroes
Week-08 Algo Questions
Given an integer array nums, move all 0's to the end of it while maintaining the relative
order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0, 1, 0, 3, 12]
Example 2: Input: nums = [0]
Constraints:
• 1 <= nums.length <= 104
• -231 <= nums[i] <= 231 - 1
Output: [1, 3, 12, 0, 0] Output: [0]
Follow up: Could you minimize the total number of operations done?
Please, test your solution here: https://leetcode.com/problems/move-zeroes/
 */

import java.util.Arrays;

public class Q1_MoveZeroes {

    public static void main(String[] args) {

        // TESTS HERE
        int [] i = new int[] {2, 6, 0, 0, 3};
        int [] i2 = new int[] {0};
        int [] i3 = new int[] {0,0,0,6, 2, 3, 5, 7, 0};
        int [] i4 = new int[] {0, 0, 5, 6, 7, 77, 0, 0};
        int [] i5 = new int[] {5, 3, 7, 0, 0 };
        System.out.println(Arrays.toString(shiftZeroToRight_Sopo(i)));
        System.out.println(Arrays.toString(shiftZeroToRight_Sopo(i2)));
        System.out.println(Arrays.toString(shiftZeroToRight_Sopo(i3)));
        System.out.println(Arrays.toString(shiftZeroToRight_Sopo(i4)));
        System.out.println(Arrays.toString(shiftZeroToRight_Sopo(i5)));

    }

    // SOLUTIONS HERE
    private static int [] shiftZeroToRight_Sopo (int [] a){
        if (a.length==1){
            return a;
        }
        Arrays.sort(a); //Sorting Array

        int newArray [] = new int[a.length]; //Declaring new array with specific length

        int count = 0; //index count
        for (int each:a){
            if (each !=0){ //if doesn't equal to 0 add to count.
                newArray [count] = each;
                count++;
            }
        }
        return newArray;
    }

}
