package programs;

public class CountNumberDigits {
	
	
	public static void main(String[] args) {
		
		int num = 150;
		int[] arr = Integer.toString(num).chars().map(c -> c - '0').toArray();
		int count = 0;
		for (Integer number : arr) {
			count++;
		}
		System.out.println(count);
	}
	
/*	while(num > 0)
	{
		 num/10;
		 count++;
	}*/
}
