package Solutions.week6;

public class Q2_ValidPalindrome {
    public static void main(String[] args) {

        System.out.println(ValidPalindrome_Sopo("Was it a car or a cat I saw?"));
        System.out.println(ValidPalindrome_Sopo("Do geese see God?"));
        System.out.println(ValidPalindrome_Sopo("A brown fox jumping over"));
        System.out.println(ValidPalindrome_Sopo("Level"));
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
            return false;
        }

    }
}
