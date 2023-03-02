package Solutions.week7;

/*
Question-2 Two Sum

Given an array of integers nums and an integer target, return the two numbers such that they add up to target.
Assume that each input would have exactly one solution, and you should not use the same element twice.
You can return the answer in any order.
No solution will return empty array.
Please, use two pointer strategy to solve this problem
(Hint : you should sort the input first).

Example:
Input: nums = [16, 3, 11, 5, 15], target = 8
Output: [3, 5]
Explanation: Because nums[1] + nums[3] => 3 + 5 = 8, we return [3, 5].
Optional additional task: Try to return original indices of the pair numbers.
 */

import java.util.Arrays;

public class Q2_TwoSum {

    public static void main(String[] args) {

        int[] arr = {16, 3, 11, 5, 15};
        int target = 8;

        System.out.println(Arrays.toString(Oleksii_TwoSum(arr, target)));

        System.out.println(Arrays.toString(twoSum_Malik(arr,target)));//3,5
    }

    static int[] Oleksii_TwoSum(int[] arr, int target) {

        int leftP = 0;
        int rightP = arr.length - 1;


        arr = Arrays.stream(arr).sorted().toArray();
        while (leftP < rightP) {
            if (arr[leftP] + arr[rightP] < target) {
                leftP++;
                continue;
            } else if (arr[leftP] + arr[rightP] > target) {
                rightP--;
                continue;
            } else if (arr[leftP] + arr[rightP] == target) {
                return new int[]{arr[leftP], arr[rightP]};
            }
        }

        return new int[]{-1, -1};
    }
    public static int[] twoSum_Malik(int[]ar,int target){
        int []an=new int[2];

        for (int i = 0; i < ar.length; i++) {
            for (int j =i+1; j < ar.length; j++) {
                if(ar[i]+ar[j]==target){
                    an[0]+=ar[i];
                    an[1]+=ar[j];
                    break;
                }
            }
        }

        return an;
    }
}
