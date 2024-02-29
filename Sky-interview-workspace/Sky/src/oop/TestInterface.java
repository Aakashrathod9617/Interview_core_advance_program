package oop;

public class TestInterface implements Interface {
	
	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
public static void main(String[] args) {
		TestInterface t=new TestInterface();
		int y =t.sum(5, 10);
		System.out.println(y);
	}


}
