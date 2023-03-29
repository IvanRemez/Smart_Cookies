package Solutions.week11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = null;

        nums = new int[]{2, 2, 1}; // expected result: 1
        System.out.println("input nums: " + Arrays.toString(nums));
        System.out.println("result: " + singleNumber_Maria(nums)); //todo instead of dummy method, call your method from here
        System.out.println("****************************");

        nums = new int[]{2, 2, 4, 5, 5}; // expected result: 4
        System.out.println("input nums: " + Arrays.toString(nums));
        System.out.println("result: " + singleNumber_Maria(nums)); //todo instead of dummy method, call your method from here
        System.out.println("****************************");

        nums = new int[]{9}; // expected result: 9
        System.out.println("input nums: " + Arrays.toString(nums));
        System.out.println("result: " + singleNumber_Maria(nums)); //todo instead of dummy method, call your method from here
        System.out.println("****************************");

        int[] nums1 = {2, 2, 1};
        int[] nums2 = {4, 1, 2, 1, 2};
        int[] nums3 = {1};

        System.out.println(singleNumber_Zehra(nums1)); // 1
        System.out.println(singleNumber_Zehra(nums2)); // 4
        System.out.println(singleNumber_Zehra(nums3)); // 1
    }

    static int dummySolution(int[] nums) {
        //just for method blueprint
        return 0;
    }

    public static int singleNumber_Maria(int[] nums) {

        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;
    }

    public static int singleNumber_Zehra(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.remove(nums[i])) {
                set.add(nums[i]);
            }
        }
        return set.stream().findAny().orElseThrow();
    }
}
