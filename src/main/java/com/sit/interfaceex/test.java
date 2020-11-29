package com.sit.interfaceex;
/**
 * 
 * @author Surya Teja
 *
 *interface is combination of static methods / abstarct methods / default methods (java 8)
 *inteface can not be instaitied 
 *interface default methods are public abstarct
 *interface variable default final
 *interface can be implemnted by class using implements keyword
 *inteface can extend another interface
 *interface can not have constructor
 */
//@FunctionalInterface
public interface test extends test2 {
	
	
	int i=10;

	void display();
	//void display11();
	static void display1() {
		
	}
	default void display2() {
		System.out.println();
	}
}
