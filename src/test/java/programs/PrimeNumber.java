package programs;

public class PrimeNumber {

//	number should be > 1.
//	Divisible by 1 & the number itself - Prime number (That's why the count == 2)

	public static void main(String[] args) {
		
		int num = 6;
		int count = 0;
		
		for (int i = 1; i < num; i++) {
			if (num % i == 0)
				count++;
		}
		if (count == 2)
			
			System.out.println("prime number");
		else
			System.out.println("Not prime number");
		
	}
}
