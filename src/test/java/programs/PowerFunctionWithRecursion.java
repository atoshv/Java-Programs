package programs;

public class PowerFunctionWithRecursion {

    public static void main(String[] args) {
        int num = 3;
        int exponent = 3;
        int result = power(num, exponent);
        System.out.println(result);  // Output: 27
    }

    public static int power(int num, int exponent) {
        if (exponent == 0) {
            return 1;  // Base case: any number to the power of 0 is 1
        }
        return num * power(num, exponent - 1);  // Recursive step
    }
}
