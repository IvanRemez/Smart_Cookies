package Solutions.week08;

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
        int[] nums = {0, 1, 0, 3, 12};
        int[] nums2 = {0};

        moveZerosToTheEnd_Zehra(nums); // [1, 3, 12, 0, 0]
        moveZerosToTheEnd_Zehra(nums2); // [0]

    }

    // SOLUTIONS HERE
    public static void moveZerosToTheEnd_Zehra(int[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] !=0){
                array[count++] = array[i];
            }
        }

        while (count < array.length) {
            array[count++] = 0;
        }
        System.out.println(Arrays.toString(array));
    }
}
