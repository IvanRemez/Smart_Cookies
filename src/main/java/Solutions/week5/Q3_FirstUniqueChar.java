package Solutions.week5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q3_FirstUniqueChar {

    public static void main(String[] args) {

        uniqueCharWithFor("success");

        System.out.println(uniqueCharWithStream("success"));

    }

    public static String uniqueCharWithStream(String str) {
        return Arrays.stream(str.split(""))
                .filter(s -> Collections.frequency(List.of(str.split("")), s) == 1)
                .findFirst()
                .orElse(" ");
    }

    public static void uniqueCharWithFor(String str) {

        for (int i = 0; i < str.length(); i++) {

            if (str.indexOf(str.charAt(i), str.indexOf(str.charAt(i)) + 1) == -1) {
                System.out.println(str.charAt(i));
                break;
            }
        }
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