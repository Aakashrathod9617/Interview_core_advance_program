package Exeptions;


public class Finally {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			double d = a / b;
			System.out.println(d);
         
		} finally {
			System.out.println("executed");
		}
	}

}
