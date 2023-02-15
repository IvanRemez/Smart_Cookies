package Solutions.MahirWeek05;

public class firstUniqueCharacther {
/*
Write a function that returns the first non-repeated character from a string.
If all characters are repeated return a space character.
 */
    public static char FirstUniqueCharacther(String word) {

        for (int i = 0; i < word.length(); i++) {
            char unique = word.charAt(i);
            int count = 0;
            for (int j = 0; j < word.length(); j++) {

                if (unique == word.charAt(j)) {
                    count++;
                }
            }
            if (count==1){
                return unique;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(FirstUniqueCharacther("mmmaaahhhiiiirrr"));
    }
}
