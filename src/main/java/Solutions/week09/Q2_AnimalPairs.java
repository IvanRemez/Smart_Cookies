package Solutions.week09;

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

        String[] animals = {"dog", "dog","goat", "cat", "cat", "cat", "goat"};
        String[] animal2 = {"dog"};
        String[] animal3 = {"dog", "goat", "cat"};

        System.out.println(AnimalToTheArk_Sopo(animals));
        System.out.println(AnimalToTheArk_Sopo(animal2));
        System.out.println(AnimalToTheArk_Sopo(animal3));

    }

    // SOLUTIONS HERE

    public static Map<String, Integer> AnimalToTheArk_Sopo (String [] animal) {

        Map<String, Integer> map = Arrays.stream(animal) //Converting String [] to Map
                .collect(Collectors.toMap(s->s, s->1, Integer::sum));
        Map<String, Integer> newEntry = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()>=2){
                newEntry.put(entry.getKey(), 2); //set on fixed value
            }
        }
        return newEntry;
    }


}
