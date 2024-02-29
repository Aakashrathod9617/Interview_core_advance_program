package set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet0 {


	public static void main(String[] args) {

		// Creating an empty LinkedHashSet
		LinkedHashSet<String> set = new LinkedHashSet<String>();

		// Use add() method to add elements into the Set
		set.add("Welcome");
		set.add("To");
		set.add("Geeks");
		set.add("4");
		set.add("Geeks");

		// Displaying the LinkedHashSet
		System.out.println("LinkedHashSet: " + set);
		
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}

	}

}
