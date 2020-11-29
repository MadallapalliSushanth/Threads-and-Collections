package com.sit.first;
// This program contains an error and will not compile.
class Program8 {
	static void throwOne() throws IllegalAccessException {
		System.out.println("Inside throwOne.");
		throw new IllegalAccessException("Throws Demo");
	}
	public static void main(String args[]) {
		try {
			throwOne();
		} //catch(IllegalAccessException ilae) {
		catch(Exception ilae) {
			System.err.println("Exception : "+ilae.getMessage());
		}		
	}
}