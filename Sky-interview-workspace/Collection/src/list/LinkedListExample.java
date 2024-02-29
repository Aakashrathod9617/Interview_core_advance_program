package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		l.add("Nitesh");
		l.add("Ravi");
		l.add("Ajay");

		System.out.println(l);

		Iterator itr = l.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(l.indexOf("Nitesh"));

		System.out.println("get and set method example");
		System.out.println(l.get(1));
		l.set(1, "Shashank");
		System.out.println(l);

	}

}
