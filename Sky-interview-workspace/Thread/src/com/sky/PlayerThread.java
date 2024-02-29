package com.sky;

//import com.rays.thread.PlayerThread;

public class PlayerThread extends Thread {

	public PlayerThread(ThreadGroup tg, String name) {
		super(tg,name);
	}
	@Override
	public void run() {
		for (int match = 0; match <5; match++) {
			String msg=getName();
			msg +="-> played match"+ match;
			System.out.println(msg);
		}
	}
	
	public static void main(String[] args) {
		ThreadGroup team= new ThreadGroup("Team India");
		PlayerThread t1= new PlayerThread(team, "virat");
		PlayerThread t2= new PlayerThread(team, "Rohit");
		t1.start();
		t2.start();
		
		System.out.println("Thread Group Info");
		System.out.println("Name : "+team.getName());
		System.out.println("Active Thread "+ team.activeCount());
		//System.out.println("Active subGroups " +team.activeGroupCount());
		
	}
}
