package com.threadexample;
	public class ThreadExample1 
	{
		public static void main(String[] args) 
		{
			Thread t1 = new Thread(() ->
			{
				for(int i=1;i<=2;i++)
				{
					System.out.println("Hi");
					try {Thread.sleep(1000); } catch(Exception e){}
				}
			});
			Thread t2 = new Thread(() ->
			{
				for(int i=1;i<=3;i++)
				{
					System.out.println("Hello");
					try {Thread.sleep(2000); } catch(Exception e) {}
				}
			 });
			
			
			t1.start();
			try {Thread.sleep(10); } catch(Exception e) {}
			t2.start();
		}
	}

