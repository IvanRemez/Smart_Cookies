package Solutions.week11;

import java.util.Arrays;
import java.util.HashSet;

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

    int[] arr ={2,2,3,3,4,5,5,6,6};
    System.out.println(findSingleNumber_Sefika(arr));
  }

  static int dummySolution(int[] nums) {
    //just for method blueprint
    return 0;
  }
  public static int singleNumber_Maria(int[] nums) {

    int result = 0;
    for (int i:nums) {
      result ^=i;
    }
    return result;
  }

  public static int findSingleNumber_Sefika(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      if (set.contains(arr[i])) {
        set.remove(arr[i]);
      } else {
        set.add(arr[i]);
      }
    }
    return set.stream().findAny().get();
  }
}
