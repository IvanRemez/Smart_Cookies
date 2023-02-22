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

public class Q1_ValidAnagram {


    public static void main(String[] args) {

        isAnagram_Mahir("anagram","nagaram");
        System.out.println(isAnagram_Mahir("anagram","nagaram"));

    }

    public static boolean isAnagram_Mahir(String s,String t){
        String[]charactherForS=s.toLowerCase().split("");
        String[]charactherForT=t.toLowerCase().split("");
        Arrays.sort(charactherForS);
        Arrays.sort(charactherForT);
        if (Arrays.equals(charactherForS,charactherForT)){
            return true;
        }
        return false;
    }

}
