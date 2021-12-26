package programs;

public class PowerFunction {
	
	public static void main(String[] args) {
		
		
		int num = 3;
		int exponent = 3;
		int power = 1;
		for (int i = 0; i <= exponent; i++) {
			power = power * num;
		}
		System.out.println(power);
	}
}
