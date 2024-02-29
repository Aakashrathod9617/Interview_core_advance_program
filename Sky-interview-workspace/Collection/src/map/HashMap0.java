package map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap0 {

	

	public static void main(String[] args) {

		java.util.HashMap map = new java.util.HashMap();

		map.put(null, "Zero");
		map.put("0", null);
		map.put("6", "One");
		map.put("4", "Two");
		map.put("3", "Three");

		
		System.out.println(map);
		System.out.println(map.values());

		
//		String val = (String) map.get("1");
//
//		map.remove("1");
//
//		Set Keys = map.keySet();
//		for (Object k : Keys) {
//			System.out.println(k);
//		}
//
//		Collection vals = map.values();
//		for (Object v : vals) {
//			System.out.println(v);
//		}
//
//		Set KeyValue = map.entrySet();
//		for (Object ele : KeyValue) {
//			Map.Entry pair = (Map.Entry) ele;
//			System.out.println(pair.getKey() + "-" + pair.getValue());
//
//		}
//	}
	}
}
