package FailFastSafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {
	public static void main(String[] args) {
		

		List l = new ArrayList();

		l.add(1);
		l.add(2);
		 l.add(90);
		// l.add(3);

		Iterator it = l.iterator();

		// l.remove(2); // Here we cannot add or remove elements
		//l.add(3);
		
		while (it.hasNext()) {

			System.out.println(it.next() + "Directly Passing Iterator Object");

			// Object obj = (Object) it.next();

			// System.out.println(obj + " Dushra");

		}
	}

}
