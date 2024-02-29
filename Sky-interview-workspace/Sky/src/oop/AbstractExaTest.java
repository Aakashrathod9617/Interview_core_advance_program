package oop;

public class AbstractExaTest extends AbstractExampal {
	
	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	public static void main(String[] args) {
		AbstractExaTest a=new AbstractExaTest();
		System.out.println(a.add(10, 15));
	}

}
