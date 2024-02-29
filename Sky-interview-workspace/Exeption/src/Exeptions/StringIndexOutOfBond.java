package Exeptions;

public class StringIndexOutOfBond {
	public static void main(String[] args) {

		String s = "Shashank";

		// System.out.println(s.charAt(90));
		try {

			System.out.println(s.charAt(10));

		} catch (StringIndexOutOfBoundsException e) {

			System.out.println(e.getMessage());

		}

	}


}
