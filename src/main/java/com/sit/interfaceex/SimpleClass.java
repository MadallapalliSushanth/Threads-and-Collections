package com.sit.interfaceex;

public class SimpleClass {

	public static void main(String[] args) {

		SimpleInt obj = new SimpleInt() {
			public void display(int i, int s) {
				System.out.println(i+ "--" +s);
			}
		};
		obj.display(10, 20);
		
		SimpleInt obj1 = (m,n) -> System.out.println(m+ "--" +n);
		
		
		obj1.display(100, 199);

	}

}
