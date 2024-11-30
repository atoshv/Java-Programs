package programs;

import java.util.HashMap;
import java.util.Iterator;

public class NonDuplicateNumbers {

    public static void main (String[] args){
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
}
