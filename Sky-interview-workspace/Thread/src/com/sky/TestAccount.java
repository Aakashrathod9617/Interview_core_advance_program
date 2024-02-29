package com.sky;

public class TestAccount extends Thread{
	
	public TestAccount(String name) {
		super(name);
	}
	
	private static AccountRacing a= new AccountRacing();
	
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			a.deposit(getName(), 1000);
		}
	}
	
	public static void main(String[] args) {
		TestAccount t1= new TestAccount("a");
		TestAccount t2= new TestAccount("b");

	t1.start();
		t2.start();
	}
}
