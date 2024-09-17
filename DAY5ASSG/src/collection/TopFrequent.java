package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TopFrequent {

	public static void main(String st[]) {

		ArrayList<String> list = new ArrayList<>(15);

		list.add("Apple");
		list.add("Cucumber");
		list.add("Banana");
		list.add("Apple");
		list.add("Grapes");
		list.add("Apple");
		list.add("Guava");
		list.add("Apple");
		list.add("Banana");
		list.add("Apple");
		list.add("Grapes");
		list.add("Banana");
		list.add("Guava");
		list.add("Banana");
		list.add("Mango");

		Map<String, Integer> mp = new HashMap<String, Integer>();
		
		for(String it:list) {
			if(mp.containsKey(it)) {
				
				int currCount  = mp.get(it);
				mp.put(it, currCount+1);
			}
			else {
				mp.put(it, 1);
			}
		}
		
		
		

	}
}
