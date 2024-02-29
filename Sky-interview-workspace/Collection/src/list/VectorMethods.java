package list;

import java.util.Vector;

public class VectorMethods {


	public static void main(String[] args) {

		Vector v = new Vector(); // Initial capacity of this constructor is 10

		v.addElement("Shashank");
		v.addElement("Pandey");
		v.addElement(100);

		v.setElementAt("Shekahr", 1);
		System.out.println(v.subList(1, 3));
		
		System.out.println(v.firstElement());
		System.out.println(v);
		System.out.println(v.capacity());

	}

}
