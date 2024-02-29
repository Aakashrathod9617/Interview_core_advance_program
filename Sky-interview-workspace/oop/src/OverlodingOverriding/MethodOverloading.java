package OverlodingOverriding;

public class MethodOverloading {
	public void move(int num) {
		System.out.println("first numbver is "+ num);
		
	}
	
	public void move(int num,int num1) {
		System.out.println(num+num1);
		
	}
	
	public static void main(String[] args) {
		MethodOverloading load=new MethodOverloading();
		load.move(10);
		load.move(10, 12);
	}

}
