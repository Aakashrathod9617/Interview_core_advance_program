package JavaBasic;

public class Armstrong {
	
	public static void main(String[] args) {

		int a=153;
		int b=a;
		int r;
		int sum=0;
		while(b!=0) {
			r=b%10;
			sum=sum+(r*r*r);
			b=b/10;
		}
if (sum==a) {
	System.out.println("Armstrong");
	
}else {
	System.out.println("not Armstrong");
}
	
	}
	}