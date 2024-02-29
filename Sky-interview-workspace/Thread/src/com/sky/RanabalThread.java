package com.sky;

public class RanabalThread implements Runnable {
		String name=null;
	public RanabalThread(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		for (int i = 0; i <2; i++) {
			System.out.println(i +" = "+name);
		}
		
	}
public static void main(String[] args) {
	
	Thread t1= new Thread(new RanabalThread("aakash"));
	Thread t2= new Thread(new RanabalThread("Ram"));
	t1.start();
	t2.start();
}
	
}
