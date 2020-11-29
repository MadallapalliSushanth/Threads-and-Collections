package com.sit.first;
// This program is not synchronized when the method call is triggered without the keyword synchronized.
// The program is synchronized if the method call is triggered as follows: synchronized void call(String msg) {
class Callme {	
	synchronized void call(String msg) {
	//void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}

class Caller implements Runnable {
	String msg;
	Callme target;
	Thread t;
	public Caller(Callme targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	public void run() {
		target.call(msg);
	}
}
class Program16 {
	public static void main(String args[]) {
		Callme target = new Callme();
		Caller ob1 = new Caller(target, "Hello");		
		Caller ob3 = new Caller(target, "World");
		Caller ob2 = new Caller(target, "Synchronized");
		// wait for threads to end
		// Set Thread Prioirities and observe the execution.
		//ob1.t.setPriority(10);
		///ob2.t.setPriority(1);
		
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}