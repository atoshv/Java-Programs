package programs;

import java.util.HashMap;

public class FindNonDuplicateNumbers {

    public static void main(String[] args) {

        int[] arr = {10, 7, 5, 0, 3, 4, 1, 2, 5, 3};

        // Create a HashMap to store the frequency of each number
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the occurrences of each number in the array
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Iterate through the map and find numbers that occur exactly once
        System.out.println("Non-duplicate numbers:");
        for (Integer key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) == 1) {
                System.out.println(key);
            }
        }
    }
}
