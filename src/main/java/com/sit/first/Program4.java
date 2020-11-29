package com.sit.first;
// Multiple Catch with Generic Exception Class
class Program4 {
	public static void main(String args[]) {
		try {
			int a = args.length;
			System.out.println("a = " + a);
			int b = 42 / a; // ArithmeticException
			int c[] = { 1 };
			System.out.println("Length of the Array c = " + c.length);
			c[42] = 99; // ArrayIndexOutOfBoundsException
		} /* Error Block
			catch(Exception e) { // Generic Exception Handler
			System.out.println("Some Exception: " + e);
		}*/
		  catch(ArithmeticException e) {
			System.out.println("Divide by 0: " + e);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index oob: " + e);
		} catch(Exception e) { // Generic Exception Handler
			System.out.println("Some Exception " + e);
		}
		System.out.println("After try/catch blocks.");
	}
}