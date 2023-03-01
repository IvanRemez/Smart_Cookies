package Solutions.week7;

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

import java.util.Map;
import java.util.TreeMap;

public class EXTRA {

    public static void main(String[] args) {

        int[] array = {1,2,2,2,2,2,2,2,2,2,2,2};

        System.out.println(extra_Emre(array));

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

}
