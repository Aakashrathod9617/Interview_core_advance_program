package Comparator;

import java.util.Comparator;

public class OrderByCollegeNo implements Comparator<College> {

	@Override
	public int compare(College c, College c1) {

		if (c.id < c1.id) {

			return -1;

		} else if (c.id == c1.id) {

			return 0;

		} else {

			return 1;
		}

	}

}
