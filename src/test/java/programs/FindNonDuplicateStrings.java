package programs;

import java.util.HashMap;

public class FindNonDuplicateStrings {

    public static void main(String[] args) {

        String[] arr = {"apple", "banana", "grape", "kiwi", "banana", "kiwi", "orange"};

        // Create a HashMap to store the frequency of each string
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        // Count the occurrences of each string in the array
        for (String str : arr) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }

        // Iterate through the map and find strings that occur exactly once
        System.out.println("Non-duplicate strings:");
        for (String key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) == 1) {
                System.out.println(key);
            }
        }
    }
}
