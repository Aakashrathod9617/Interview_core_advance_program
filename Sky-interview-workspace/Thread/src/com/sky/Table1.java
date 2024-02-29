package com.sky;

public class Table1 extends Thread {
	Table t;

	public Table1(Table t) {
		this.t = t;
	}

	@Override
	public void run() {

		t.printtable(5);
	}

}
