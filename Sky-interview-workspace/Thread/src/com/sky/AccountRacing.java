package com.sky;

public class AccountRacing {
	
	public int balance=0;
	
	public int getBalance() {
		delay();
		return balance;
		
	}
	public void setBalance(int balance) {
		delay();
		this.balance=balance;
	}
	
	public void delay() {
		
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void deposit(String s, int a) {
		synchronized (this) {
		int b= getBalance()+a;
		setBalance(b);
		
		System.out.println(s +" New Balance "+ b);
		}
	}
    
	
	

}
