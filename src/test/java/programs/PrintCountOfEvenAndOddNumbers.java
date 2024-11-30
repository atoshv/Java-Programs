package programs;

import java.util.Scanner;

public class PrintCountOfEvenAndOddNumbers {

    public static void main (String[] args)
    {
        int even_count = 0, odd_count = 0;
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
    }

