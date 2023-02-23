package Solutions.week6;

import java.util.Arrays;

public class Q1_ValidAnagram {

    public static void main(String[] args) {

        System.out.println(validAnagram_Sopio("Apple", "lePpA"));


    }

    public static Boolean validAnagram_Sopio (String str, String str2){

        String [] newStr= str.toLowerCase().split("");
        String [] newStr2 = str2.toLowerCase().split("");
        Arrays.sort(newStr);
        Arrays.sort(newStr2);
        if (Arrays.equals(newStr,newStr2)){
            return true;
        }else {
            return false;
        }

    }

}
