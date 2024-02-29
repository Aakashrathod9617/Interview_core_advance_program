package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BasicHashMap {

	public static void main(String[] args) {

		HashMap h = new HashMap();

		h.put(10, "Aakash");
		h.put(11, "Rathod");

		System.out.println(h);

		Set s = h.entrySet();

		System.out.println(s);

		Iterator i = s.iterator();

		while (i.hasNext()) {

		//	System.out.println(i.next());

			Map.Entry e = (Map.Entry) i.next();

			System.out.println(e.getKey() + " - " + e.getValue());
		}
	}
//	
//	HashMap h= new HashMap();
//	h.put(1, "Aakash");
//	h.put(2, "Rathod");
//	Set s= h.entrySet();
//	System.out.println(s);
//	Iterator itr=s.iterator();
//	
//	while(itr.hasNext()) {
//		System.out.println(itr.next());
//	}
	
	
}
