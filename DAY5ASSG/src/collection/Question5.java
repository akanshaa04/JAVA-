package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Question5 {
	public static void main(String arg[]) {

		HashSet set = new HashSet<>(5);

		set.add("Akansha");
		set.add("Akku");

		set.add(new MyOwnClass(21, " Welcome"));
		set.add(new MyOwnClass(25, " Java"));

		set.add(3);
		set.add(4);
		set.add(5);

		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
