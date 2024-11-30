package programs;

public class PrintEvenAndOddNumber {

    public static void main (String[] args)
    {
        int[] num = {1, 2, 3, 4, 5, 6, 44, 43};
        StringBuilder evens = new StringBuilder();
        StringBuilder odds = new StringBuilder();

        for (int i = 0; i < num.length; i++) {
            //int rem = num[i] % 10;

            if (num[i] % 2 == 0)
                evens.append(" ").append(num[i]);
            else
                odds.append(" ").append(num[i]);
        }
        System.out.println("even: " + evens);
        System.out.println("odd: " + odds);
    }
    }

