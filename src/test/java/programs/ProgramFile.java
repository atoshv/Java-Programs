package programs;

import java.util.*;
import java.util.stream.Stream;

public class ProgramFile {
	
	/**
	 * =============================================
	 */
	
	public void sumOfArray() {
		int sum = 0;
		int[] arr = {1, 2, 3, 4, 5, 6};
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}
	
	/**
	 * =============================================
	 */
	
	public void sumOfNumbersFromList() {
		int sum = 0;
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		
		for (int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}
		System.out.println(sum);
	}
	
	/**
	 * =============================================
	 */
	public void factorialNumber() {
		long factorial = 1;
		int num;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + num + " is " + factorial);
	}
	
	/**
	 * =============================================
	 */
	public void fibonacci() {
		int n1 = 0, n2 = 1, n3, count = 10;
		System.out.println(n1 + "\n" + n2);
		for (int i = 2; i < count; ++i) {
			n3 = n1 + n2;
			System.out.println("" + n3);
			n1 = n2;
			n2 = n3;
		}
	}
	
	/**
	 * =============================================
	 */
	
	public void reverseNumber() {
		int num, rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		int temp = num;
		while (num > 0) {
			int remainder = num % 10;
			rev = (rev * 10) + remainder;
			num = num / 10;
		}
		System.out.println("Reverse of number is:" + rev);
		if (temp == rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}
	
	/**
	 * =============================================
	 */
	
	public void reverseString() {
		String string, rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		string = sc.next();
		
		for (int i = string.length() - 1; i >= 0; i--) {
			rev = rev + string.charAt(i);
		}
		System.out.println("Reverse string is: " + rev);
		if (string.contentEquals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
		
	}
	
	/**
	 * =============================================
	 */
	
	public void reverseSentence() {
		String string = "Hi Atosh How are you";
		String rev = "";
		
		String[] inputArr = string.split(" ");
		for (int i = inputArr.length - 1; i >= 0; i--) {
			rev = rev + " " + inputArr[i];
			
		}
		System.out.println("Reverse string is: " + rev.trim());
	}
	
	/**
	 * =============================================
	 */
	
	public void swapping() {
		int a = 10, b = 20;
		
		System.out.println("Before Swapping: " + a + " " + b);
		a = a * b;
		b = a / b;
		a = a / b;
		
		System.out.println("After swapping: " + a + " " + b);
	}
	
	/**
	 * =============================================
	 */
	public void countNumberOfDigits() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number of your choice: ");
		int num = sc.nextInt();
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("Total number of digits: " + count);
		// example: input: 123  and output: 3 because there are total 3 digits in 123
	}
	
	/**
	 * =============================================
	 */
	
	public void printCountOfEvenAndOddNumbers() {
		int rem, even_count = 0, odd_count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers of your choice: ");
		int number = sc.nextInt();
		
		
		if (number % 2 == 0) {
			even_count++;
		} else {
			odd_count++;
		}
		
		System.out.println("Even numbers count: " + even_count);
		System.out.println("Odd numbers count: " + odd_count);
	}
	
	/**
	 * =============================================
	 */
	public void printEvenAndOddNumber() {
		int[] num = {1, 2, 3, 4, 5, 6, 44, 43};
		String evenstr = "", oddstr = "";
		
		for (int i = 0; i < num.length; i++) {
			//int rem = num[i] % 10;
			
			if (num[i] % 2 == 0)
				evenstr = evenstr + " " + num[i];
			else
				oddstr = oddstr + " " + num[i];
		}
		System.out.println("even: " + evenstr);
		System.out.println("odd: " + oddstr);
	}
	
	/**
	 * =============================================
	 */
	
	public void primeNumbers() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers of your choice: ");
		num = sc.nextInt();
		
		/**
		 * number should be > 1.
		 * Divisible by 1 & the number itself - Prime number (That's why the count == 2)
		 */
		int count = 1;
		if (num > 1) {
			
			for (int i = 1; i < num; i++) {
				if (num % i == 0)
					count++;
			}
			if (count == 2)
				System.out.println("This Number is Prime: " + num);
			else
				System.out.println("This number is not Prime: " + num);
		} else {
			System.out.println("Number is not Prime & Try entering number greater than 1");
		}
		
	}
	
	/**
	 * =============================================
	 */
	
	public void duplicateCountNumbers() {
		int[] arr = new int[]{1, 4, 5, 6, 7, 2, 1, 2};
		Arrays.sort(arr);
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (Integer key : arr) {
			if (map.get(key) != null) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			int temp = it.next();
			if (map.get(temp) > 0) {
				System.out.println(temp + "--" + map.get(temp));
			}
		}
	}
	
	/**
	 * =============================================
	 */
	
	public void duplicateCountString() {
		String str = "atoshabcdabc";
		char[] arr = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (Character key : arr) {
			if (map.get(key) != null) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		
		Iterator<Character> it = map.keySet().iterator();
		while (it.hasNext()) {
			Character temp = it.next();
			if (map.get(temp) > 0) {
				System.out.println(temp + "--" + map.get(temp));
			}
		}
	}
	
	/**
	 * =============================================
	 */
	
	public void duplicateWords() {
		String[] str = {"atosh", "akash", "pavi", "pavi"};
		HashMap<String, Integer> map = new HashMap<>();
		
		for (String key : str) {
			
			if (map.get(key) != null) {
				
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String s = it.next();
			if (map.get(s) > 0) {
				System.out.println(s + " --  " + map.get(s));
			}
		}
	}
	
	/**
	 * =============================================
	 */
	
	public void duplicateNumbers() {
		int[] arr = {1, 2, 3, 4, 1, 2};
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (Integer key : arr) {
			if (map.get(key) != null) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			int temp = it.next();
			
			if (map.get(temp) > 1) {
				System.out.println("Duplicate number: " + temp);
			}
		}
	}
	
	/**
	 * =============================================
	 */
	
	public void nonDuplicateNumbers() {
		int[] arr = {1, 2, 3, 4, 1, 2};
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (Integer key : arr) {
			if (map.get(key) != null) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			int temp = it.next();
			
			if (map.get(temp) == 1) {
				System.out.println("Non Duplicate number: " + temp);
			}
		}
	}
	
	/**
	 * =============================================
	 */
	public void combineTwoStringArray() {
		String[] a = {"Atosh", "Akash"};
		String[] b = {"Pavi", "pavitra"};
		
		Stream<String> sa = Arrays.stream(a);
		Stream<String> sb = Arrays.stream(b);
		
		String[] c = Stream.concat(sa, sb).toArray(size -> new String[size]);
		System.out.println("After concat: ");
		
		for (String str : c) {
			System.out.println(str);
		}
	}
	
	public long countOccurrenceUsingStreams(char ch) {
		
		String str = "Hi Atosh, How are you doing";
		return str.chars().filter(e -> (char) e == ch).count();
	}
	
	/**
	 * =============================================
	 */
	public void nonDuplicateNumbersFromArray() {
		
		int rem;
		int rev = 0;
		int num;
		int count = 0;
		int[] arr = {23, 45, 54, 32, 12, 21, 13, 14};
		for (int i = 0; i < arr.length; i++) {
			num = arr[i];
			
			while (num > 0) {
				rem = num % 10;
				rev = (rev * 10) + rem;
				num = num / 10;
			}
			
			for (int j = 0; j < arr.length; j++) {
				if (rev == arr[j])
					count++;
			}
			if (count == 0)
				System.out.println(arr[i]);
			count = 0;
			rev = 0;
			
		}
	}
	
	/**
	 * =============================================
	 */
	public void findDuplicateNumbersAfterReverseOfNumber() {
		
		int rem;
		int rev = 0;
		int num;
		
		int count = 0;
		int[] arr = {23, 45, 23, 54, 32, 12, 21, 45, 14};
		
		for (int i = 0; i < arr.length; i++) {
			num = arr[i];
			
			while (num > 0) {
				rem = num % 10;
				rev = (rev * 10) + rem;
				num = num / 10;
			}
			for (int j = 0; j < arr.length; j++) {
				if (rev == arr[j]) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(rev + " number is repeated " + count + " times");
			}
			count = 0;
			rev = 0;
		}
	}
	
	/**
	 * =============================================
	 */
	public void calculator() {
		
		char operator;
		Double number1, number2, result;
		
		// create an object of Scanner class
		Scanner input = new Scanner(System.in);
		
		// ask users to enter operator
		System.out.println("Choose an operator: +, -, *, or /");
		operator = input.next().charAt(0);
		
		// ask users to enter numbers
		System.out.println("Enter first number");
		number1 = input.nextDouble();
		
		System.out.println("Enter second number");
		number2 = input.nextDouble();
		
		switch (operator) {
			
			// performs addition between numbers
			case '+':
				result = number1 + number2;
				System.out.println(number1 + " + " + number2 + " = " + result);
				break;
			
			// performs subtraction between numbers
			case '-':
				result = number1 - number2;
				System.out.println(number1 + " - " + number2 + " = " + result);
				break;
			
			// performs multiplication between numbers
			case '*':
				result = number1 * number2;
				System.out.println(number1 + " * " + number2 + " = " + result);
				break;
			
			// performs division between numbers
			case '/':
				result = number1 / number2;
				System.out.println(number1 + " / " + number2 + " = " + result);
				break;
			
			default:
				System.out.println("Invalid operator!");
				break;
		}
		
		input.close();
	}
	
	
	/**
	 * =============================================
	 */
	public void mergeArraysAndSort() {
		int[] arr1 = {10, 7, 5, 0};
		int[] arr2 = {3, 4, 1, 2};
		int size = arr1.length + arr2.length;
		
		int[] arr3 = new int[size];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		
		for (int i = 0; i < arr2.length; i++) {
			arr3[arr1.length + i] = arr2[i];
		}
		for (int i = 0; i < size; i++) {
			Arrays.sort(arr3);
			System.out.println(arr3[i]);
		}
	}
	
	/**
	 * =============================================
	 */
	
	public void powerFunction() {
		int base = 2;
		int exponent = 3;
		int result = 1;
		while (exponent != 0) {
			result = result * base;
			exponent--;
		}
		System.out.println("power of a number is: " + result);
	}
	
	/**
	 * =============================================
	 */
	public void missingNumberFromArray() {
		int[] arr = {1, 3, 5, 4, 6};
		List<int[]> ls = new ArrayList<>();
		Arrays.sort(arr);
		for (Integer a : arr) {
			System.out.println("Sorted elements are: " + a);
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1) {
				System.out.println(i + 1);
				break;
			}
		}
	}
	
	/**
	 * =============================================
	 */
	
	
	public void powerFunctionWithRecursion() {
	
	}
	
	
	/**
	 * =============================================
	 */
	// find the indices & sum of its maximum positive-sum continuous sub array.
	// A = {1, -4, 3, 6, -7, 0}
	// Max Sum = 9
	public void MaxSumOfSubArray() {
	
	}
	
	
}

/**
 * =============================================
 */

class RunnerMain {
	
	public static void main(String[] args) {
		
		ProgramFile p = new ProgramFile();
		//p.sumOfArray();
		//p.sumOfNumbersFromList();
		//p.factorialNumber();
		//p.fibonacci();
		//p.reverseNumber();
		//p.reverseString();
		//p.swapping();
		//p.printCountOfEvenAndOddNumbers();
		//p.primeNumbers();
		//p.countNumberOfDigits();
		//p.duplicateCountNumbers();
		//p.duplicateCountString();
		//p.duplicateWords();
		//p.duplicateNumbers();
		//p.nonDuplicateNumbers();
		//p.reverseSentence();
		//p.printEvenAndOddNumber();
		//p.combineTwoStringArray();
		//System.out.println(p.countOccurrenceUsingStreams('o'));
		//p.nonDuplicateNumbersFromArray();
		//p.findDuplicateNumbersAfterReverseOfNumber();
		//p.calculator();
		//p.mergeArraysAndSort();
		//p.powerFunction();
		//p.powerFunctionWithRecursion();
		//p.MaxSumOfSubArray();
		//p.missingNumberFromArray();
	}
}



	


