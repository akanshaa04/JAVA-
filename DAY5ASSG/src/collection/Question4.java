package collection;

import java.util.HashSet;
import java.util.Iterator;

@SuppressWarnings("all")
public class Question4 {

	public static void main(String arg[]) {
		
		HashSet set  = new HashSet<>(5);
		
		set.add("Akansha");
		set.add("Akku");
		
		set.add(new MyOwnClass(1, " Welcome"));
		set.add(new MyOwnClass(2, " Java"));
		
		set.add(3);
		set.add(4);
		set.add(5);
		
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
