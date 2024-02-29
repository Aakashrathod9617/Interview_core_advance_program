package com.sky;

public class HelloThread extends Thread{

	String name=null;
	
	public HelloThread(String name){
		this.name=name;
	}
	public void run() {
		for (int i = 0; i <2;  i++) {
			System.out.println(i +" = "+name);
		}
	}
	public static void main(String[] args) {
		
		HelloThread t1= new HelloThread("Aakash");
		HelloThread t2= new HelloThread("Ram");
		
		t1.start();
		t2.start();

	}
}
