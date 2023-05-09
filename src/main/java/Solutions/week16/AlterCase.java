package Solutions.week16;
/*
Question-2 Alter Case

Given a path of input file which includes sentence(s), write a program that reads alternates the
case of every alphabetic character, starting with uppercase. Spaces and non-alphabetical characters
should be added to the final output as is, i.e. they should not be taken into account when alternating
between upper/lowercase. Input: Your program should read lines from file as a standard input. Each
line contains a sentence. Assume all characters are ASCII.

Output: For each sentence from standard input, return a string which contains a sentence in each line
such that the first character is uppercase, the next character is lowercase and so on.
Test 1
Test Input: We are the world Expected Output: We ArE tHe WoRlD
Test 2
Test Input: this is some code
Expected Output: ThIs Is SoMe CoDe Please, try to test your solution via JUnit.
 */

public class AlterCase {

    public static void main(String[] args) {

        // TEST HERE

        String input1 = "We are the world";
        String input2 = "this is some code";

        System.out.println(alterCase_Maria(input1));
        System.out.println(alterCase_Maria(input2));

    }

    // SOLUTIONS HERE
    public static String alterCase_Maria(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                result += str.substring(i, i + 1).toUpperCase();
            } else {
                result += str.substring(i, i + 1);
            }
        }
        return result;

    }

}
