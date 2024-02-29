package com.sky;



public class MovieBookApp {

	public static void main(String[] args) throws InterruptedException {
		TotalEarning t = new TotalEarning();
		t.start();
		
		//boolean alive = t.isAlive();
		//System.out.println(alive);
		
		//t.join()
		
		synchronized (t) {
			t.wait();
		}
		System.out.println("Total earning:"+t.total+" in Rs");
	}
}


