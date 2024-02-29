package JavaBasic;



public class SwitchCase {
	
	public static void main(String[] args) {
		
	
	int a=10;
	int b=5;
	
	for (int i = 1; i <=4; i++) {
		
		switch(i) {
		case 1:
			System.out.println(a+b);
			break;
			
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		}
		
	}
	}	

}
