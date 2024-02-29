 package Exeptions;

public class Arithmetic {
	public static void main(String[] args) {

		int a =0;
		int b=15;
		
		try {
			int c=b/a;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

}
