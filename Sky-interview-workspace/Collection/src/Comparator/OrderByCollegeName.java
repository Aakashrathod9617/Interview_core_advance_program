package Comparator;

import java.util.Comparator;

public class OrderByCollegeName implements Comparator<College> {

	@Override
	public int compare(College c, College c1) {

		
		if(c.name == (c1.name)) {
			return c.Lname.compareTo(c1.name);
		}else {
			
			return c.name.compareTo(c1.name);
		}

	}

}
