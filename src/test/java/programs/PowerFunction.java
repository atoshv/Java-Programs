package programs;

public class PowerFunction {
	public static void main(String[] args) {
		int num = 3;
		int exponent = 3;
		int power = 1; //power is initialized to 1 because any number to the power of 0 is 1.

		for (int i = 0; i < exponent; i++) {  // Change to i < exponent
			power = power * num;
		}
		System.out.println(power);  // Output: 27
	}

}
