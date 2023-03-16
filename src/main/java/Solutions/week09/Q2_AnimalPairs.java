package Solutions.week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Q2_AnimalPairs {

    /*
    Question-2 The Animals Went in Two by Two

A great flood has hit the land, and just as in Biblical times we need to get the animals to the ark in pairs.
We are only interested in getting one pair of each animal, and not interested in any animals where there are
less than 2. They need to mate to repopulate the planet after all!
Write a function that takes a list of animals as a parameter, which you need to check to see which animals
there are at least two of, and then return a Map<String, Integer> that contains the name of the animal along
with the fact that there are 2 of them to bring onto the ark.

Examples:
Input: [] Output: {}
Input: ['goat'] Output: {}
Input : ["dog", "goat", "dog"] Output: {dog=2}
Input : ["dog", "cat", "dog", "cat", "beaver", "cat"] Output: {cat=2, dog=2}
Input: ["goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan"] Output: {horse=2, rabbit=2, goat=2}
     */

    public static void main(String[] args) {

        // TEST HERE

        String[] animals = {"dog", "dog", "goat", "cat", "cat", "cat", "goat"};
        String[] animal2 = {"dog"};
        String[] animal3 = {"dog", "goat", "cat"};
        String[] s1 = {};
        String[] s2 = {"goat"};
        String[] s3 = {"dog", "goat", "dog"};
        String[] s4 = {"dog", "cat", "dog", "cat", "beaver", "cat"};
        String[] s5 = {"goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan"};

        System.out.println(AnimalToTheArk_Sopo(animals));
        System.out.println(AnimalToTheArk_Sopo(animal2));
        System.out.println(AnimalToTheArk_Sopo(animal3));
        System.out.println("------------------------------------");
        System.out.println(pairAnimals_Zehra(s1)); // {}
        System.out.println(pairAnimals_Zehra(s2)); // {}
        System.out.println(pairAnimals_Zehra(s3)); // {dog=2}
        System.out.println(pairAnimals_Zehra(s4)); // {cat=2, dog=2}
        System.out.println(pairAnimals_Zehra(s5)); // {horse=2, rabbit=2, goat=2}

        Oleksii_GetPairs(animals);
        Oleksii_GetPairs(animal2);
        Oleksii_GetPairs(animal3);

    }

    // SOLUTIONS HERE

    public static Map<String, Integer> AnimalToTheArk_Sopo(String[] animal) {

        Map<String, Integer> map = Arrays.stream(animal) //Converting String [] to Map
                .collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
        Map<String, Integer> newEntry = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                newEntry.put(entry.getKey(), 2); //set on fixed value
            }
        }
        return newEntry;
    }


    public static Map<String, Integer> pairAnimals_Zehra(String[] array) {

        Map<String, Integer> map = new HashMap<>();
        if (array.length == 0 || array.length == 1) {
            return map;
        }
        for (String each : array) {
            if (map.containsKey(each)) {
                map.put(each, 2);
            } else {
                map.put(each, 1);
            }
        }

        map.entrySet().removeIf(entry -> entry.getValue() == 1);
        return map;
    }

    public static void Oleksii_GetPairs(String[] str) {

        Map<String, Integer> map = new HashMap<>();
        for (String s : str) {
            if (map.containsKey(s))
                map.put(s, map.get(s).intValue() + 1);
            else map.put(s, 1);
        }
        map.forEach((k, v) ->
        {
            if (v % 2 == 0) {
                System.out.print("{" + k + "=" + v + "} ");
            } else if (v % 2 == 1 && v != 0) {
                System.out.print("{" + k + "," + --v + "} ");
            }
        });
        System.out.println();

    }
}
