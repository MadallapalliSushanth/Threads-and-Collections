package com.threadexample;

public class Task implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try {Thread.sleep(2000); } catch(Exception e) {}
		}
	}
	
public	class Task1 implements Runnable
	{
		public void run()
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hello");
				try {Thread.sleep(1000); } catch(Exception e) {}
			}
		}
	}
public static void main(String args[]) throws InterruptedException {
	
	
}
}
