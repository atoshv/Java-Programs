package programs;

public class RemoveDuplicatesWithoutHashMap {
    public static void main (String[] args)
    {
        int[] array = {1, 2, 3, 2, 4, 1, 5, 3};
        int n = array.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int k = 0; k < j; k++) {
                if (array[i] == array[k]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                array[j++] = array[i];
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
