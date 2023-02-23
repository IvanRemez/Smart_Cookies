package Solutions.week6;

/*
Question - 2 Valid Palindrome

Write a function that accepts a string and determines whether it is a palindrome, ignoring non-alphanumeric characters and case and returns true if it is palindrome.
Please, use two pointer strategy (opposite direction).
(A string is said to be palindrome if it reads the same backward as forward, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters). Examples:
Input: Do geese see God?                Output: True
Input: Was it a car or a cat I saw?     Output: True
Input: A brown fox jumping over         Output: False

Please, test your solution here : https://leetcode.com/problems/valid-palindrome/

You may try two pointer technique for second question to improve your time & space complexity.

Two Pointer Strategy / Technique
• The name, “two pointers”, explains the strategy clearly.
• It's the use of two different pointers (usually to keep track of array, ArrayList or String
indices) to solve a problem with the benefit of saving time and space.
• A pointer is a reference to an object.
• In many problems involving collections such as arrays or lists, we should analyze each
element of the collection compared to its other elements.
• We can process two elements per loop instead of just one. Common patterns in the
two-pointer approach entail:
▪ Two pointers, each starting from the beginning and the end until they
both meet.
▪ One pointer moving at a slow pace, while the other pointer moves at
Output: True Output: True Output: False
twice the speed.
 */

public class Q2_ValidPalindrome {

    public static void main(String[] args) {

        isPalindrome_Mahir("A man, a plan, a canal: Panama");
        System.out.println(isPalindrome_Mahir("A man, a plan, a canal: Panama"));


    }

    public static boolean isPalindrome_Mahir(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        int lastElement = s.length() - 1; int firstElement = 0;
        while(lastElement>firstElement) {
            if (s.charAt(firstElement)==s.charAt(lastElement)){
                lastElement--;
                firstElement++;

            }else{
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome_Emre(String str) {

        str = str.toLowerCase();

        int i = 0, j = str.length()-1;

        while (i<j) {

            if (!Character.isLetterOrDigit(str.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(str.charAt(j))) {
                j--;
                continue;
            }
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static Boolean ValidPalindrome_Sopo (String str){

        String reverse = "";

        // Remove all non-alphanumeric characters from the string
        String newStr = str.replaceAll("[^a-zA-Z0-9]", "");

        // Reverse the alphanumeric string
        for (int i = newStr.length()-1; i >=0;  i--) {
            reverse+=newStr.charAt(i);
        }

        // Check if the reversed string is equal to the original string (ignoring case)
        if (newStr.equalsIgnoreCase(reverse)){
            return true;
        }else {
            return false; //returns
        }

    }

}


