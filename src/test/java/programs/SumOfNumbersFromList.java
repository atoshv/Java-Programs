package programs;

import java.util.ArrayList;
import java.util.List;

public class SumOfNumbersFromList {

public static void main (String[] args)
{
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
}

