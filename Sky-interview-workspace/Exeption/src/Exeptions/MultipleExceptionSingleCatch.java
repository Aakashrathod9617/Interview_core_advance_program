package Exeptions;

public class MultipleExceptionSingleCatch {
	public static void main(String[] args) {
		
		String str=null;
		String str1="Aakash";
		int a=0;
		int b=121;
		
		
		try {
			int c = b/a;
			
			System.out.println(c);
			System.out.println(str1.charAt(123));
			System.out.println(str.length());
			
		} catch (NullPointerException | StringIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println(e);
		}
	}

}
