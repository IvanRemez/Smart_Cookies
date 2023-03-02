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

import java.util.ArrayList;
import java.util.Arrays;

public class Q2_TwoSum {

    public static void main(String[] args) {
    
        int[] arr = {16, 3, 11, 5, 15};
        int target = 8;

        System.out.println(Arrays.toString(TwoSum_Mahir(arr,target)));
        System.out.println(Arrays.toString(Oleksii_TwoSum(arr, target)));

        Integer[] nums = {5, 2, 3, 4, 1};

        System.out.println(Arrays.toString(twoSum_Emre(nums,8)));

        int arr2[] = {16, 3, 11, 5, 15};
        System.out.println(Arrays.toString(sum_Zehra(arr2, 8))); // [3, 5]
    }

    public static int[] sum_Zehra(int[] arr, int target) {

        Arrays.sort(arr);

        int rightPointer = 0;
        int leftPointer = arr.length - 1;

        while (rightPointer < leftPointer) {

            if (arr[rightPointer] + arr[leftPointer] < target) {
                rightPointer++;
            } else if (arr[rightPointer] + arr[leftPointer] > target) {
                leftPointer--;
            } else {
                return new int[]{arr[rightPointer], arr[leftPointer]};
            }
        }
        return new int[]{-1, -1};

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

    public static Integer[] twoSum_Emre(Integer[] nums, int target) {

        Integer[] array = Arrays.copyOf(nums,nums.length);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

        Arrays.sort(nums);

        int left_pointer = 0;
        int right_pointer = nums.length-1;

        while (left_pointer < right_pointer) {

            int pairSum = nums[left_pointer] + nums[right_pointer];

            if (pairSum < target)
                left_pointer++;
            else if (pairSum > target)
                right_pointer--;
            else
                return new Integer[] {list.indexOf(nums[left_pointer]),list.indexOf(nums[right_pointer])};

        }
        return new Integer[]{};
    }
    public static int[] TwoSum_Mahir(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        Arrays.sort(nums);
        while (r > l) {
            if (nums[r] + nums[l] == target) {
                return new int[]{nums[l], nums[r]};
            } else if (nums[r] + nums[l] < target)
                l++;
            else {
                r--;
            }
        }
        return new int[]{};
    }

}
