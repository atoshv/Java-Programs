package programs;

public class Swap {
	
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("Before: " + a + "   " + b);
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After:  " + a + "   " + b);
		
		System.out.println("-----------------------------");
		
		System.out.println("Before: " + a + "   " + b);
		
		a = a * b;
		b = a / b;
		a = a / b;
		
		System.out.println("Before: " + a + "   " + b);
		
		
	}
}
