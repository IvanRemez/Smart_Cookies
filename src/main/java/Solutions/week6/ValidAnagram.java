package Solutions.week6;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram_Zehra("anagram", "nagaram")); // true
        System.out.println(isAnagram_Zehra("rat", "car")); // false
        System.out.println(isAnagram_Zehra("Buckethead", "DeathCubeK")); // true
        System.out.println(isAnagram_Zehra("", " ")); // false
    }

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
}
/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 */
