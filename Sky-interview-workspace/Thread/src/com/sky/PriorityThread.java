package com.sky;

public class PriorityThread extends Thread {

	public PriorityThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() +" : "+getPriority());
		}
	}
	public static void main(String[] args) {
		
		PriorityThread t1= new PriorityThread("Thread#A");
		PriorityThread t2= new PriorityThread("Thread#B");
		PriorityThread t3= new PriorityThread("Thread#C");
		t1.setPriority(10);
		t2.setPriority(1);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
