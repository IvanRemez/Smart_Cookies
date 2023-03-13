package Solutions.week07;

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
        System.out.println(missingNum_Mahir(nums));

        System.out.println(Oleksii_MissingNum(nums));
    
        int[] arr = {3, 0, 1};
        int[] arr2 = {0, 1};
        int[] arr3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(missingNumber_Zehra(arr)); // 2
        System.out.println(missingNumber_Zehra(arr2)); // 2
        System.out.println(missingNumber_Zehra(arr3)); // 8


        int[] array = {5,3,7,2,1,9,6,0,8};
        System.out.println(missingNumber_Emre(array));

        System.out.println("-----------------------------------------------------");
        int[] array_Sefika ={1,3,5,2,0}; //n=5 , [0,5]
        System.out.println(Q1_MissingNum.missingNumber_Sefika(array_Sefika)); //4

        int[] nums1 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int size = nums1.length;
        System.out.println(missingNum_Ivan(nums1, size));

        int[] array_Malik ={1,3,5,2,0};//n=5 [0,5]
        System.out.println(isMissing_Malik(array_Malik));
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

    public static int missingNumber_Emre(int[] array) {

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != i) {
                return i;
            }
        }
        return array[array.length - 1] + 1;
    }
    public static  int missingNum_Mahir(int[]nums){
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i!=nums[i]){
                return i;
            }
        }
        return nums.length;
    }

    public static int missingNumber_Sefika(int[] array_Sefika){
        int result= 0;
        int n = array_Sefika.length;
        int sum = ( n * (n+1)) / 2;
        int sumOfArray = Arrays.stream(array_Sefika).sum();
        result = sum - sumOfArray;
        return result;

    }

    public static int missingNum_Ivan(int[] nums, int n)
    {
        int sum = (n * (n + 1)) / 2;
        for (int i = 0; i < n; i++)
            sum -= nums[i];
        return sum;
    }
    public static int isMissing_Malik(int[] arr){

        int ar=0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {

            if(ar==arr[i]){
                ar++;
            } else{
                break;
            }


        }
        return ar;
    }
}
