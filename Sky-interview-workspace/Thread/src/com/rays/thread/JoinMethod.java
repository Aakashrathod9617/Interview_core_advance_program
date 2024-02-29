package com.rays.thread;

public class JoinMethod extends Thread{
	
	@Override
	public void run() {
		String name = currentThread().getName();
		for(int i=0; i<2; i++) {
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	
	}
	public static void main(String[] args){
		JoinMethod t1 = new JoinMethod();
		JoinMethod t2 = new JoinMethod();
		JoinMethod t3 = new JoinMethod();
		
		t1.setName("Sumit");
		t2.setName("Amit");
		
		
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
