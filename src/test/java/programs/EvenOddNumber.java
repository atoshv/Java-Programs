package programs;

public class EvenOddNumber {
	
	public static void main(String[] args) {
		
		int num = 23;
		int even_count = 0;
		int odd_count = 0;
		if (num % 2 == 0) {
			System.out.println("Number is Even");
			even_count++;
		} else {
			System.out.println("Number is Odd");
			odd_count++;
		}
		
		System.out.println("Even number count is: " + even_count);
		System.out.println("Odd number count is: " + odd_count);
		
	}
}
