package com.rays.thread;

public class BankTest {

	public static void main(String[] args) {
		
		//First Object
		Bank bank = new Bank(1000);

		Thread t1 = new Thread(bank);
		Thread t2 = new Thread(bank);

		t1.setName("Neeraj");
		t2.setName("Vinod");
		
		t1.start();
		t2.start();
		
	}
}
