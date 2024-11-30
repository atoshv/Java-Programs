package programs;

import java.util.Arrays;

public class MergeTwoStringArrays {

    public static void main(String[] args) {

        String[] arr1 = {"apple", "banana", "grape", "kiwi"};
        String[] arr2 = {"pear", "orange", "cherry", "mango"};
        int l = arr1.length + arr2.length;
        String[] arr3 = new String[l];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }

        // Sorting the merged array of strings
        Arrays.sort(arr3);

        // Printing the sorted merged array
        for (String mergeArr : arr3) {
            System.out.println(mergeArr);
        }
    }
}
