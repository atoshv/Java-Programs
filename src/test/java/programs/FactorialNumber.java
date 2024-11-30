package programs;

public class FactorialNumber {
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();

		int num = 6;
		int factorial = 1;
		
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
			
		}
		System.out.println("factorial of a number is: "+factorial);
		
	}
	
	
}
