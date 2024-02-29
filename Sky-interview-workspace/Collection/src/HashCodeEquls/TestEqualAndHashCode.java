package HashCodeEquls;

public class TestEqualAndHashCode {


	public static void main(String[] args) {
		EqualAndHashCode m1 = new EqualAndHashCode("Aakash", "10", 100);
		EqualAndHashCode m2 = new EqualAndHashCode("Aakash", "10", 100);

		System.out.println(m1.equals(m2));
		System.out.println(m1.hashcode());
		System.out.println(m2.hashcode());
		// System.out.println(m1.toString());
		 //System.out.println(m2.toString());

	}
}
