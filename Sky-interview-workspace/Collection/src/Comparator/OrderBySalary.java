package Comparator;

import java.util.Comparator;

public class OrderBySalary implements Comparator<College> {

	@Override
	public int compare(College c, College c1) {
	
		if (c.salary == (c1.salary)) {

			return c.name.compareTo(c1.name);

		} else {

			return c.salary - c1.salary;
		}
		
		
	}

}
