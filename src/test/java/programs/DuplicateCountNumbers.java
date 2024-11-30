package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class DuplicateCountNumbers {
    public static void main(String[] args)
    {
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
}
