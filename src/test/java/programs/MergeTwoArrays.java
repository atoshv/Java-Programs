package programs;

import java.util.Arrays;

public class MergeTwoArrays {
	
	public static void main(String[] args) {
		
		int[] arr1 = {10, 7, 5, 0};
		int[] arr2 = {3, 4, 1, 2};
		int l = arr1.length + arr2.length;
		int[] arr3 = new int[l];
		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr3[arr1.length + i] = arr2[i];
		}
		Arrays.sort(arr3);
		for (Integer mergeArr : arr3) {
			System.out.println(mergeArr);
		}
	}
}
