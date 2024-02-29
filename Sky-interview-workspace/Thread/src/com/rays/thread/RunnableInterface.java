package com.rays.thread;

public class RunnableInterface implements Runnable{
	
	private String name=null;
	
	public RunnableInterface(String n) {
		this.name=n;
	}

	@Override
	public void run() {
		for (int i = 0; i <2; i++) {
			System.out.println(i+"=>"+name);
		}
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableInterface("Ram"));
		Thread t2 = new Thread(new RunnableInterface("Shyam"));
	t1.start();
	t2.start();
	
	}
	

}
