package JavaBasic;

public class DivInArr {
	public static void main(String[] args) {
		int [] value= {7, 10, 15, 14, 49};
		
		for (int i = 0; i < value.length; i++) {
			if (value[i]%7==0) {
				System.out.println(value[i]);
			}
		}
	}

}
