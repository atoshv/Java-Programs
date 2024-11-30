package programs;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateCountString {

    public static void main (String[] args)
    {
        String str = "atoshabcdabc";
        char[] arr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (Character key : arr) {
            if (map.get(key) != null) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        Iterator<Character> it = map.keySet().iterator();
        while (it.hasNext()) {
            Character temp = it.next();
            if (map.get(temp) > 1) {
                System.out.println(temp + " --> " + map.get(temp));
            }
        }
    }
}
