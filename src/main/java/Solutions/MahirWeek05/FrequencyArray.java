package Solutions.MahirWeek05;

import java.util.HashMap;
import java.util.Map;
public class FrequencyArray {
/*
Write a function that takes a String array as parameter and returns a map object that
contains each element of array as key and their occurrence counts as value.
For calculating occurrence, array elements should be checked by regarding case sensitivity.
Order is not important.
 */
    public static Map<String,Integer>frequencyArray(String[]arr){

        Map<String,Integer>frequencyAndCharacther=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])){
                    count++;
                }
                frequencyAndCharacther.put(arr[i],count);
            }

        }
        return frequencyAndCharacther;
    }

    public static void main(String[] args) {
        System.out.println(frequencyArray(new String[]{"Apple", "Banana", "apple", "Cherry", "Apple"}
        ));
    }
}
