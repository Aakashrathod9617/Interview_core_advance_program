package Exeptions;

public class ArrayIndexOutOfBond {
	public static void main(String[] args) {

		
		char[] a= {'a', 'b', 'c'};
		
		try {
			System.out.println(a[6]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
