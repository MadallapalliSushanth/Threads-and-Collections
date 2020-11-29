package com.sit.first;
// Demonstrate finally.
class Program9 {
	// Throw an exception out of the method.
	static void procA() {
		try {
			System.out.println("inside procA");
			throw new RuntimeException("demo for finally");
		} /*catch(RuntimeException re){
			re.printStackTrace();
		} */finally {
			System.out.println("procA's finally");
			// Disconnect or any other task or logic
		}
	}
	// Return from within a try block.
	static void procB() {
		try {
			System.out.println("inside procB");
			return;
		} finally {
			System.out.println("procB's finally");
		}
	}
	// Execute a try block normally.
	static void procC() {
		try {
			System.out.println("inside procC");
			throw new RuntimeException("demo for finally");
		} finally {
			System.out.println("procC's finally");
		}
	}
	
	public static void main(String args[]) {
		try {
			procA();
			procC();
		} catch (Exception e) {
			System.out.println("Exception caught from procA."+e);
			System.out.println("Exception caught from procC."+e);
		}
		procB();
		procC();
	}
}