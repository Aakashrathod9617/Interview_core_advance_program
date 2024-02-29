package FailFastSafe;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class FailSafe {

	public static void main(String[] args) {

		ArrayBlockingQueue l = new ArrayBlockingQueue(9);

		l.add(1);
		l.add(2);
		l.add(4);
		l.add(5);
		
		
		Iterator it = l.iterator();

		l.add(3);
		// l.remove(3);

		while (it.hasNext()) {
			// Object obj = (Object) it.next();
			System.out.println(it.next());
		}

	}
}
