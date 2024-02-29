package HashCodeEquls;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseACollection {

	
	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");

		Collections.reverse(list);
		System.out.println(list);
	}
}
