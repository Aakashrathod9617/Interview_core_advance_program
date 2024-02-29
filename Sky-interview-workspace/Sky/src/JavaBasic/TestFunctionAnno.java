package JavaBasic;

public class TestFunctionAnno {
	public static void main(String[] args) {
		
		Functional_Int fi=new Functional_Int() {
			
			@Override
			public int sum(int a, int b) {
				
				return a+b;
			}
		};
		int a=70;
		int b=40;	
	System.out.println(fi.sum(a, b));	
	Functional_Int.multi(a, b);
	fi.sub(a, b);
	
	
	}

}
