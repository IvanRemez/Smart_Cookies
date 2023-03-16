package Solutions.week09;

public class Q1_LengthOfLastWord {

    /*
    Question-1 Length of Last Word

Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World" Output: 5 Explanation: The last word is "World" with length 5.
Example 2:
Input:s=" flyme to themoon " Output:4 Explanation: The last word is "moon" with length 4.
Example 3:
Input: s = "luffy is still joyboy" Output: 6 Explanation: The last word is "joyboy" with length 6.

Constraints:
1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
Please, test your solution here: https://leetcode.com/problems/length-of-last-word/
     */

    public static void main(String[] args) {

        // TEST HERE

        String str_Sopo = "Hello World";
        String str2_Sopo = "fly me to the moon";
        String str3_Sopo = "Hello";


    }

    // SOLUTIONS HERE

    public static int LengthOfLastWord_Sopo (String s){
        if (s.length()<=1){
            return 1;
        }
        if (!(s.contains(" "))){
            return s.length();
        }

        s= s.trim();
        int lastSpaceIndex = s.lastIndexOf(" ");//get the index of the last space
        String result = s.substring(lastSpaceIndex);//get the all characters after last space index
        int output = result.length()-1;
        return output;
    }


    public static int Oleksii_LenghtOfTheLastWord(String word){
        String[] arr = word.split(" ");
        return arr[arr.length-1].length();
    }
}
