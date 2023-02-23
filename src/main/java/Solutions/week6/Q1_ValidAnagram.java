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
import java.util.HashSet;

public class Q1_ValidAnagram {


    public static void main(String[] args) {

        isAnagram_Mahir("anagram", "nagaram");
        System.out.println(isAnagram_Mahir("anagram", "nagaram"));

        System.out.println(isAnagram_Emre("anagram", "nagaram"));

        System.out.println(isAnagram_Ivan("anagram", "nagaram"));

    }

    public static boolean isAnagram_Ivan(String s, String t) {

        char[] sChar = s.toLowerCase().toCharArray();
        char[] tChar = t.toLowerCase().toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }

    public static boolean isAnagram_Mahir(String s, String t) {
        String[] charactherForS = s.toLowerCase().split("");
        String[] charactherForT = t.toLowerCase().split("");
        Arrays.sort(charactherForS);
        Arrays.sort(charactherForT);
        if (Arrays.equals(charactherForS, charactherForT)) {
            return true;
        }
        return false;
    }


    static boolean isAnagram_Oleksii( String str1, String str2 ){

        HashSet map1 = new HashSet( Arrays.asList(str1.toLowerCase().split("")));
        HashSet map2 = new HashSet( Arrays.asList(str2.toLowerCase().split("")));

        if(map1.equals(map2))
            return true;
        return false;
    }

    public static boolean isAnagram_Emre(String s, String t) {

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)) {
            return true;
        }
        return false;
    }

}

