package com.sit.first;

public class Program6 {

	public static void main(String[] args) {
		// To compute the execution time of a class

		long start, end;
		System.out.println("Timing a for loop from 0 to 100,000,000");
		// time a for loop from 0 to 100,000,000
		start = System.currentTimeMillis(); // get starting time
		System.out.println("Start time: " + start);
		for (long i = 0; i < 100000000L; i++) // Do nothing Loop
			;
		end = System.currentTimeMillis(); // get ending time
		System.out.println("End time: " + end);
		
		System.out.println("Elapsed time: " + (end - start) + " ms");

	}

}
