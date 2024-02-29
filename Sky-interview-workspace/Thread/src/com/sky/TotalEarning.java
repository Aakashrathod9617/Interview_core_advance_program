package com.sky;



public class TotalEarning extends Thread {

	int total=0;
	public void run() {
		synchronized (this) {
		
			for(int i=1;i<=5;i++) {
				total = total + 100;
			}
			
			this.notify();
		}
		
	}
}