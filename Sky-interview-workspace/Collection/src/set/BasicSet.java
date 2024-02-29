package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BasicSet {
	
	public static void main(String[] args) {

		Set s = new HashSet();

		
		s.add("Rathod");
		s.add("Aakash");

		System.out.println(s);
		System.out.println();

		Iterator i = s.iterator();

		while (i.hasNext()) {

			System.out.println(i.next());
		}

	}


}
