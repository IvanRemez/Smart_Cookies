package Solutions.week8;

/*
Question-2 Remove Duplicates from Sorted Array

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in Java, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.
Do not allocate extra space for another array. You must do this by modifying the input array in-place with
O(1) extra memory.
Example 1:
Input: nums = [1, 1, 2] Output: 2, nums = [1, 2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:
Input:nums=[0,0,1,1,1,2,2,3,3,4] Output:5,nums=[0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Constraints:
1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.
Please, test your solution here: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

import java.util.Arrays;
import java.util.HashSet;

public class Q2_RemoveDuplicates {

    public static void main(String[] args) {

        // TESTS HERE
        Integer [] arr1 = new Integer[] {3, 3, 5, 5, 0, 1};
        Integer [] arr2 = new Integer[] {0, 0, 9, 8, 5, 5, 6, 6, 7, 7};
        Integer [] arr3 = new Integer[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        setWithoutDuplicates_Sopo(arr1);
        setWithoutDuplicates_Sopo(arr2);
        setWithoutDuplicates_Sopo(arr3);


    }

    // SOLUTIONS HERE
    public static void setWithoutDuplicates_Sopo (Integer arr []){

        HashSet<Integer> setWithoutDuplicates = new HashSet<>(); //sorts and removes duplicates

        for (int i = 0; i < arr.length; i++) {
            setWithoutDuplicates.add(arr[i]); //adding all elements in HashSet from arr
        }

        int count =  setWithoutDuplicates.size(); //counting size of HashSet

        System.out.println("K = "+count+ " nums = "+setWithoutDuplicates);
    }


}
