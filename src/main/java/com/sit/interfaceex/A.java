package com.sit.interfaceex;

class test2Imple implements test2{
	@Override
	public void display112(int i) {
		System.out.println("1199");	
	}
}
class A {
	static int a=10;
	static int b=10;
	public static void main(String args[]) {
		
		//1st way
		test2Imple obj = new test2Imple();

		obj.display112(a);
		
		//annymous inner class
		test2 objj = new test2() {
			@Override
			public void display112(int c) {
				System.out.println("119889");
			}
		};
		objj.display112(b);
		
		//lambda
		test2 obj3 =  (pavan) -> {
			System.out.println("119889000");
		};
		obj3.display112(b);
	}

}