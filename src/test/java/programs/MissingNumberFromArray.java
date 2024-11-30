package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumberFromArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 6};
        List<int[]> ls = new ArrayList<>();
        Arrays.sort(arr);
        for (Integer a : arr) {
            System.out.println("Sorted elements are: " + a);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
