package HashCodeEquls;

import java.util.ArrayList;
import java.util.Collections;

public class SortingACollection {

	

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();

		a.add(24);
		a.add(33);
		a.add(9);

		System.out.println(a); // Here Insertion Order Is followed

		Collections.sort(a); // After this by default Ascending Order

		System.out.println(a);
	}

}
