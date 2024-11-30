package programs;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateWords {

    public static void main(String[] args) {
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
                System.out.println(s + " is printed " + map.get(s) + " times");
            }

        }
    }
}
