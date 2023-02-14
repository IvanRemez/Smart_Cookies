package Solutions.week5;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q4_FrequencyOfArrElements {

    public static void main(String[] args) {

        String arr[] = {"Apple", "Banana", "apple", "Cherry", "Apple"};

        System.out.println(frequencyMapWithStream(arr));

    }

    public static Map<String, Long> frequencyMapWithStream(String[] arr) {

        return Arrays.stream(arr)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
/*
Question-4 Frequency of Array Elements

Write a function that takes a String array as parameter and returns a map object that contains each element of array as key and their occurrence counts as value.
For calculating occurrence, array elements should be checked by regarding case sensitivity. Order is not important.

EXAMPLE:
Input: {"Apple", "Banana", "apple", "Cherry", "Apple"}
Output: returning map elements: {Apple=2, apple=1, Cherry=1, Banana=1}
 */