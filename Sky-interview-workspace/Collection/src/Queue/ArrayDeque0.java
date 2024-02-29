package Queue;

import java.util.Iterator;

public class ArrayDeque0 {

	
	public static void main(String[] args) {
		java.util.ArrayDeque q = new java.util.ArrayDeque();

//		q.add("One");
//		q.add("Two");
//		q.add("Three");
//		q.addFirst("Zero");
//		q.addLast("Four");
//
//		Object ele = q.element();
//		System.out.println(q);
//		q.remove();
//		System.out.println(q);
//		q.removeFirst();
//		System.out.println(q);
//		q.removeLast();
//		System.out.println(q);
		
		q.offer(1);
		q.offer(2);
		q.offer(3);
		q.offer(4);
		q.offer(5);
		q.offer(6);
		
		Iterator itr = q.iterator();
		
		q.add(7);
		while (itr.hasNext()) {
		
			System.out.println(itr.next());
			
		}
//		
//		System.out.println(q);
//		System.out.println(q.offerFirst(1));
//		
		
	}
}
