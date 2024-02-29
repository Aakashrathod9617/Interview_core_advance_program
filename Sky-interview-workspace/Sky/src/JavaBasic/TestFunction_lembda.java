package JavaBasic;

public class TestFunction_lembda {
	public static void main(String[] args) {
		Functional_Int f= (a,b)->{
			return a+b;
			
		};
		int a=20;
		int b=10;
		System.out.println(f.sum(a, b));
		
		
	}

}
