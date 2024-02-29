package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIgnoringDuplicasy {

	public static void main(String[] args) {

		HashSet h = new HashSet();
		h.add("Ram");
		h.add("shyam");
		h.add("Mohan");
		h.add("Mohan");
		h.add("Ram");
		h.add(null);
		h.add(null);

		Iterator itr = h.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
