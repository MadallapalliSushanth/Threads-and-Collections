package com.sit.first;
// Import the classes that are available in the package mypack;

import mypack.*; // * - it represents to import all the classes that are publicly available.

//import mypack.Balance; Alternate method to import a class from a package.

class TestBalance {
	public static void main(String args[]) {
		mypack.Balance test = new mypack.Balance("SIST", 1770);
		test.show();
	}
}