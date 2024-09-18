package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TopFrequent {

	public static void main(String st[]) {

		List<String> list = new ArrayList<>(15);
////		List<String> ls = Arrays.asList("a","v");
////		aise bhi kar skte hai initialize
//
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
		
		
		
		List<Entry<String,Integer>> li = new  ArrayList<Entry<String,Integer>>();
		
		li.addAll(mp.entrySet());
		
		Collections.sort(li, (x,y)-> y.getValue().compareTo(x.getValue()));
		
		for(int i =0 ; i < 3 ; i++) {
			System.out.println(li.get(i));
		}
		
		
		

	}
}
