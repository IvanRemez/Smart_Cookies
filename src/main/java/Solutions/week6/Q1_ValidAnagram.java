package Solutions.week6;

/*
Question - 1 Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or
phrase, typically using all the original letters exactly once.

Constraints:
1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.

Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
Please, test your solution here : https://leetcode.com/problems/valid-anagram/
 */

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q1_ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram_Zehra("anagram", "nagaram")); // true
        System.out.println(isAnagram_Zehra("rat", "car")); // false
        System.out.println(isAnagram_Zehra("Buckethead", "DeathCubeK")); // true
        System.out.println(isAnagram_Zehra("", " ")); // false
        System.out.println(isAnagram_Zehra2("anagram", "nagaram")); // true
        System.out.println(isAnagram_Zehra2("rat", "car")); // false
        System.out.println(isAnagram_Zehra2("Buckethead", "DeathCubeK")); // true
        System.out.println(isAnagram_Zehra2("", " ")); // false

    }

    // *ADD YOUR SOLUTIONS HERE*
    public static boolean isAnagram_Zehra(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);
        if (Arrays.equals(sArray, tArray)) {
            return true;
        }
        return false;
    }
    public static boolean isAnagram_Zehra2(String test, String original) {
        return Stream.of(test.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining())
                .equals(Stream.of(original.toLowerCase().split(""))
                        .sorted()
                        .collect(Collectors.joining()));
    }

}
