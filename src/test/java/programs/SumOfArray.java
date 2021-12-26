package programs;

import java.util.ArrayList;

public class SumOfArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		int sum = 0;
		
		for (Integer num : arr) {
			sum += num;
		}
		
		System.out.println("sum of array is: " + sum);
		
		ArrayList<Integer> ls = new ArrayList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		
		int sum1 = 0;
		for (Integer num : ls) {
			sum1 = sum1 + num;
		}
		System.out.println("sum of list of array is: " + sum1);
	}
	
}
