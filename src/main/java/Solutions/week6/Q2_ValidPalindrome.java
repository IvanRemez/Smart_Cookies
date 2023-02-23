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
twice the speed.
 */

public class Q2_ValidPalindrome {

    public static void main(String[] args) {
    
        System.out.println(isPalindrome_Zehra("Do geese see God")); // True
        System.out.println(isPalindrome_Zehra("Was it a car or a cat I saw")); // True
        System.out.println(isPalindrome_Zehra("A brown fox jumping over")); // False
        System.out.println(isPalindrome_Zehra("A man, a plan, a canal: Panama")); // True
        System.out.println(isPalindrome_Zehra("race a car")); // False
        System.out.println(isPalindrome_Zehra2("Do geese see God")); // True
        System.out.println(isPalindrome_Zehra2("Was it a car or a cat I saw")); // True
        System.out.println(isPalindrome_Zehra2("A brown fox jumping over")); // False
        System.out.println(isPalindrome_Zehra2("A man, a plan, a canal: Panama")); // True
        System.out.println(isPalindrome_Zehra2("race a car")); // False

        System.out.println(isPalindrome_Mahir("A man, a plan, a canal: Panama"));

        System.out.println(isPalindrome_Emre("A man, a plan, a canal: Panama"));

        System.out.println(isPalindrome_Ivan("A man, a plan, a canal: Panama"));

    }

    public static boolean isPalindrome_Ivan(String str) {

        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");

        int first = 0;
        int last = str.length() - 1;

        while (last > first) {

            if (str.charAt(first) == str.charAt(last)) {
                last--;
                first++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome_Mahir(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int lastElement = s.length() - 1;
        int firstElement = 0;
        while (lastElement > firstElement) {
            if (s.charAt(firstElement) == s.charAt(lastElement)) {
                lastElement--;
                firstElement++;

            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome_Emre(String str) {

        str = str.toLowerCase();

        int i = 0, j = str.length() - 1;

        while (i < j) {

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

    static boolean isAnagram_Oleksii(String str) {

        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]","");

        var firstPointer = 0;
        var lastPointer = str.length()-1;
        while(firstPointer<lastPointer){
            if(str.charAt(firstPointer++)!=str.charAt(lastPointer--)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome_Zehra(String str) {

        String s = str.replaceAll(",", " ");
        s = s.replaceAll(":", " ");
        s = s.replaceAll(" ", "");
        s = s.toLowerCase();
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPalindrome_Zehra2(String str) {
        String s = str.replaceAll(",", " ");
        s = s.replaceAll(":", " ");
        s = s.replaceAll(" ", "");
        s = s.toLowerCase();
        int r = 0;
        int l = s.length() - 1;

        while (r < l) {

            if (!(s.charAt(r) >= 'a' && s.charAt(l) <='z')) {
                r++;
            } else if ((s.charAt(l) <= 'a' && s.charAt(l) >= 'z')) {
                l--;
            } else if(s.charAt(r) == s.charAt(l)){
                r++;
                l--;
            }else {
                return false;
            }
        }
        return true;
    }
}


