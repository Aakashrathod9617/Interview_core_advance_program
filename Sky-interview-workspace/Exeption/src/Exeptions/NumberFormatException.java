package Exeptions;

public class NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Akash";
		
		//int i = Integer.parseInt(str);

		try {
			int i = Integer.parseInt(str);
			System.out.println(i);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}
