package Solutions.week07;

/*
Problem:

Write a function that takes an integer array, counts each number and prints a sentence to say how many
times a number is repeated. Number order is not important.

Example:

input © array ={1,2,3,4,3,2,1,3,2,2,2,4,2,2,2,2,2, 2}
output :

1 is two times

3 is three times

4 is two times

2 is more than ten times
 */


import java.util.*;
import java.util.Map;

public class EXTRA {

    public static void main(String[] args) {

        int[] array = {1,2,2,2,2,2,2,2,2,2,2,2};
        int[] arr1 = {1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2};
        countNumber_Mahir(arr1);
        System.out.println("-----------------------------");

        System.out.println(extra_Emre(array));

        int[] arr = {1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4};
        int[] arr2 = {1, 2, 3, 4, 3, 2, 1, 3, 2, 2, 2, 4, 2, 2, 2, 2, 2, 2};
        System.out.println(frequencyWithWord_Zehra(arr)); // 1=two, 2=five, 3=three, 4=two
        System.out.println(frequencyWithWord_Zehra(arr2)); // 1=two, 2=more than ten, 3=three, 4=two
    }

    public static Map<Integer, String> frequencyWithWord_Zehra(int[] array) {

        Map<Integer, String> map = new HashMap<>();
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "more than ten"};


        for (int each : array) {

            int count = 0;

            for (int element : array) {
                if (each == element) {
                    count++;
                }
            }

            if (count > 10) {
                map.put(each, words[11]);
            } else {
                map.put(each, words[count]);
            }
        }
        return map;
    }

    public static String extra_Emre(int[] array) {

        String result = "";

        Map<Integer,Integer> map = new TreeMap<>();

        int count;

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])){
                count = map.get(array[i]);
                map.put(array[i], count+1);
            }else {
                map.put(array[i],1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet())  {
            String frequency = (entry.getValue()==1) ? "one" : (entry.getValue()==2) ? "two"
                    : (entry.getValue()==3) ? "three" : (entry.getValue()==4) ? "four"
                    : (entry.getValue()==5) ? "five" : (entry.getValue()==6) ? "six"
                    : (entry.getValue()==7) ? "seven" : (entry.getValue()==8) ? "eight"
                    : (entry.getValue()==9) ? "nine" : (entry.getValue()==10) ? "ten" : "more than ten";

            if (entry.getValue()==1) {
                result += entry.getKey() + " is " + frequency + " time\n";
            } else {
                result += entry.getKey() + " is " + frequency + " times\n";
            }
        }
        return result;
    }

    public static void countNumber_Mahir(int[] array) {

        String[] arr = {"one","two","three","four","five","six","seven","eight","nine","ten","more than ten"};
        Map<Integer, String> listMap = new TreeMap<>();
        Arrays.sort(array);
        int count=1;
        for (int i = 0,j=1; i < array.length; i++,j++) {
            if (j<array.length&&array[i]==array[j]){
                count++;
            }else{
                listMap.put(array[i], arr[count - 1]);
                count=1;
            }

        }
        for (Map.Entry<Integer, String> integerStringEntry : listMap.entrySet()) {
            System.out.println(integerStringEntry.toString().replace("="," is ")+" times");
        }

    }

}
