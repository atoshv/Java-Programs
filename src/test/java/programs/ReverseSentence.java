package programs;

public class ReverseSentence {
	
	public static void main(String[] args) {
		
		String str = "I am Atosh";
		StringBuilder rev = new StringBuilder();
		String[] str1 = str.split(" ");
		
		for (int i = str1.length - 1; i >= 0; i--) {
			rev.append(str1[i] + " ");
		}
		System.out.println(rev);
	}
	
}
