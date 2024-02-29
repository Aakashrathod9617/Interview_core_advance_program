package com.rays.thread2;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank(200);
		Thread t = new Thread(bank);
		Thread t1 = new Thread(bank);
		
		t.setName("Gopal");
		t1.setName("Krishna");
		
		t.start();
		t1.start();
	}

}
