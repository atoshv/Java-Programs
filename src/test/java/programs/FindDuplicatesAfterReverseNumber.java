package programs;

public class FindDuplicatesAfterReverseNumber {

public static void main (String[] args)
    {
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
    }

