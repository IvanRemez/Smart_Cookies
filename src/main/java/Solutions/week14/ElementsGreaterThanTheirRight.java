package Solutions.week14;
/*
Question-1 Find All Elements Greater Than Their Right

Given an unsorted integer array, return all greater elements than all elements present to their right using Stack.
Example:
Input: [10, 4, 6, 3, 5]
Output: [10, 6, 5]
The elements that are greater than all elements to their right are 10, 6, and 5. 10>4 & 10>6 & 10>3 & 10>5

class Main{
// Function to print all elements which are greater than all
// elements present to their right
public List<Integer> find(int[] arr){
    }
}
Please, try to test your solution via JUnit.
 */

import java.util.List;
import java.util.Stack;

public class ElementsGreaterThanTheirRight {

    public static void main(String[] args) {

        // TEST HERE
        int[] arr = {10, 4, 6, 3, 5};
        int[] arr2 = {2, 4, 6, 3};
        int[] arr3 = {2, 4, 6};
        System.out.println(find_Zehra(arr)); // [10, 6, 5]
        System.out.println(find_Zehra(arr2)); // [6, 3]
        System.out.println(find_Zehra(arr3)); // [6]

        findBruteSolution_Zehra(arr); // 10 6 5

    }

    // SOLUTIONS HERE

    public static void findBruteSolution_Zehra(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    break;
                }
                if (j == arr.length - 1) { //  //if 'j' reached to last index, that means array[i] is greater than all elements to its right, so print array[i]
                    System.out.print(arr[i] + " ");
                }
            }
            if (i == arr.length - 1) { // printing the last element as there is no element right to it, so consider it as last greater element
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static List<Integer> find_Zehra(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int each : arr) {
            while (!stack.isEmpty() && stack.peek() < each) {
                stack.pop();
            }
            stack.push(each);
        }
        return stack;
    }
}
