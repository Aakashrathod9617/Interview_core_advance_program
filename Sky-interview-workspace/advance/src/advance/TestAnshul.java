package advance;

public class TestAnshul {

	public static void main(String[] args) {

		Anshul a1 = new Anshul(5, 500, "Anshul");
		procdure a2 = new procdure();

		System.out.println(a1.equals(a2));

		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());

	}

}
