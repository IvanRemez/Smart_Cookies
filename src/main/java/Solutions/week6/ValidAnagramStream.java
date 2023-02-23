package Solutions.week6;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValidAnagramStream {

    public static void main(String[] args) {

        System.out.println(isAnagram_Zehra("rat", "car")); // false
        System.out.println(isAnagram_Zehra("Buckethead", "DeathCubeK")); // true

    }

    public static boolean isAnagram_Zehra(String test, String original) {
        return Stream.of(test.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining())
                .equals(Stream.of(original.toLowerCase().split(""))
                                .sorted()
                                .collect(Collectors.joining()));
    }
}

