package JavaBasic;

public class PeimNo {
	public static void main(String[] args) {
		
	
	int a=17;
	int count=0;
	
	for (int i = 2; i <a; i++) {
		if (a%i==0) {
			count++;
			
		}
	}
		if (count==0) {
			System.out.println("primeNo");
			
			
		}else {
			System.out.println("not");
		
	}
	}
}
