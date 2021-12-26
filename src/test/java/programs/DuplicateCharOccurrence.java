package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class DuplicateCharOccurrence {
	
	public static void main(String[] args) {
		
		String str = "AtoshA";
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (Character key : ch) {
			
			if (map.get(key) != null) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		
		Iterator<Character> it = map.keySet().iterator();
		while (it.hasNext()) {
			Character temp = it.next();
			if (map.get(temp) > 0) {
				System.out.println(temp + " ==== " + map.get(temp));
			}
			
			
		}
		
		
	}
}
