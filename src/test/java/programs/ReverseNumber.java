package programs;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int num = 123;
		int rev = 0;
		int remainder;
		int temp = num;
		while (num > 0) {
			remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num / 10;
		}
		System.out.println("Reverse of number is: " + rev);
		
		if (rev == temp)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
		
	}
	
	
}
