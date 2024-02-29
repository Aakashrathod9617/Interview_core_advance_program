package list;

import java.util.Enumeration;
import java.util.Vector;

public class BasicEnumeration {
	public static void main(String[] args) {

		Vector v = new Vector();

		v.add("Aakash");
		v.add("Rathod");
		v.add(24);
		v.add(22);

		System.out.println(v);
		System.out.println();

		Enumeration e = v.elements();

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());
		}
	}

}
