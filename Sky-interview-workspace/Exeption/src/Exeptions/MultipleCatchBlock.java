package Exeptions;

public class MultipleCatchBlock {
public static void main(String[] args) {
	

		int a =0;
		int b =15;
		String s =null;
		String s1 ="Aakash";
		
	try {
		//int i= Integer.parseInt(s1);
		int c =b/a;
		System.out.println(c);
		System.out.println(s.length());
		System.out.println(s1.charAt(23));
	} catch (IndexOutOfBoundsException e) {
		System.out.println(e);
	}catch(NullPointerException e1) {
		System.out.println(e1);
	}catch(ArithmeticException e2) {
		
		System.out.println(e2);
	}catch(Exception e3) {
		System.out.println(e3);
	}
	finally {
		System.out.println("this is finally block");
	}
		
}
}
