package programs;

import java.util.Scanner;

public class CountNumberOfDigits {

    public static void main (String[] args)
    {
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
    }

