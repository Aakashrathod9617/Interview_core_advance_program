package com.rays.thread;

public class join extends Thread{
	
	@Override
	public void run() {
		String name = currentThread().getName();
		for(int i=0; i<3; i++) {
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	
	}
	public static void main(String[] args){
		join t1 = new join();
		join t2 = new join();
		join t3 = new join();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		
		
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		t3.start();
	}

}
