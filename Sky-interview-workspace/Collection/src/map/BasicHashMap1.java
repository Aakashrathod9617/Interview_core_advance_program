package map;

import java.util.HashMap;
import java.util.Map;

public class BasicHashMap1 {


	public static void main(String[] args) {

		HashMap<Integer, String> h = new HashMap();

		h.put(10, "Shashank");
		h.put(11, "Shekhar");
		
		System.out.println(h);

		for (Map.Entry m : h.entrySet()) {

			System.out.println(m.getKey() + " - " + m.getValue());
		}
	}

}
