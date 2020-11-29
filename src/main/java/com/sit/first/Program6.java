package com.sit.first;
// Demonstrate throw.
class Program6 {
	static void secondMethod() {
		try {
			int x = 5/0;
		} catch(ArithmeticException ae){
			System.out.println("From ArithmeticException Block");
			ae.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	static void throwMethod() {
		try {
			throw new NullPointerException("example using demo and rethrow method");
		} catch(NullPointerException e) {
			System.out.println("Caught inside throw method.");
			System.out.println("Throw message from the exception is retrieved by the method e.getMessage and the message is : " + e.getMessage());
			//throw e; // rethrow the exception
		}
	}
	public static void main(String args[]) {
		try {
			throwMethod();
			secondMethod();
		} catch(NullPointerException e) {
			System.out.println("Recaught: " + e);
		}
	}
}