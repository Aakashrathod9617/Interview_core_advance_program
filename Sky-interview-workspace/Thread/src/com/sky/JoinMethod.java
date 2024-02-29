package com.sky;

public class JoinMethod extends Thread{
	
	public void run() {
		System.out.println(getName());
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		
		JoinMethod j1= new JoinMethod();
		JoinMethod j2= new JoinMethod();
		JoinMethod j3= new JoinMethod();
		
		j1.setName("Aakash");
		j1.start();
		
		try {
			j1.join();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		j2.setName("Ram");
		j2.start();
		

		j3.setName("Manish");
		j3.start();
		
			
	}

}
