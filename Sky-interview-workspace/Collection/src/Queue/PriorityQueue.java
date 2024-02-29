package Queue;



import java.util.Iterator;

public class PriorityQueue {

	public static void main(String[] args) {

		java.util.PriorityQueue q = new java.util.PriorityQueue();

		q.add("One");
		q.add("Two");
		q.add("Three");

		System.out.println(q);

		Object ele = q.element();

		ele = q.remove();

		System.out.println(ele);

		System.out.println(q);

		Iterator itr = q.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

}
