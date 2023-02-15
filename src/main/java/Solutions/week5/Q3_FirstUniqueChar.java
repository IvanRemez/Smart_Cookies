package Solutions.week5;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Q3_FirstUniqueChar {

    public static void main(String[] args) {
        FirstNonRepeatedChar("SooPhie");


    }

    public static void FirstNonRepeatedChar (String input){
        Map<Character,Long> charCount = input.toLowerCase().chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        Optional<Character> firstNonRepeat = charCount.entrySet().stream()
                .filter(e->e.getValue()==1)
                .map(e-> e.getKey()).findFirst();

        if (firstNonRepeat.isPresent()) {
            System.out.println("First Non Repeated Character " + firstNonRepeat.get());
        };

    }
}
/*
Question-3 First Unique Character

Write a function that returns the first non-repeated character from a string.
If all characters are repeated return a space character.

EXAMPLE:
Input: "success" output: u
Explanation: u and e are non-repeated, u is the first non-repeated character
 */