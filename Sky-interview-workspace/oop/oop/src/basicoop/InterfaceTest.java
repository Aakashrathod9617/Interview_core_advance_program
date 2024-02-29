package basicoop;

public class InterfaceTest implements Interface {

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
public static void main(String[]args) {
	InterfaceTest t= new InterfaceTest();
	System.out.println(t.sum(15, 20));
}
}
