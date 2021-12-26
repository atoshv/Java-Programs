package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class DuplicateCountOccurrence {
	
	public static void main(String[] args) {
		
		int[] num = {3, 4, 6, 1, 2, 10, 2, 1};
		Arrays.sort(num);
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (Integer key : num) {
			
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
				System.out.println(temp + " == " + map.get(temp));
			}
		}
		
	}
}
