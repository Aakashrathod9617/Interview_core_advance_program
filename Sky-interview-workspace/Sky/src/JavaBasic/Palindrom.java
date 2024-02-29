package JavaBasic;

public class Palindrom {
public static void main(String[] args) {
	int a=122;
	int b=a;
	int r;
	int sum=0;
	while(b!=0) {
		r=b%10;
		sum=sum*10+r;
		b=b/10;
		
		
	}
		if (sum == a) {
			System.out.println("palindrom");
			
		}else {
			System.out.println("NotPalindrom");
		}
}
}
