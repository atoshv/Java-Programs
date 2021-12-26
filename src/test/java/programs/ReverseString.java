package programs;

public class ReverseString {
	public static void main(String[] args) {
		
		String str = "AkkA";
		StringBuilder rev = new StringBuilder();
		String temp = str;
		for (int i = str.length() - 1; i >= 0; i--) {
			rev.append(str.charAt(i));
		}
		System.out.println(rev);
		
		if (rev.toString().equals(temp))
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
		
		
	}
}
