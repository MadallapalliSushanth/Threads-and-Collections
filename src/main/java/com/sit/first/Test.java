package com.sit.first;

public class Test {

	
	public static void main(String args[] ) {

		System.out.println("**");
		
		MathOperations obj = new MathOperations();
		
		int a = 10;
		int b = 7;
		int result;
		
		double s1 = 10.98;
		double s2 = 4.87;
		double sres;

		double mres;
		double tres;
		//result = obj.addition(a, b);
		result = obj.addition((int)(s1),(int) s2);
		
		//sres = obj.sub(s1, s2);
		sres = obj.sub(a,b);
		
		mres=obj.multiplication(a);
		tres=obj.multiplication1(a);
		
		System.out.println("result::"+result);
		System.out.println("sub::"+sres);
		System.out.println("mul::"+mres);
		System.out.println("tri::"+tres);

	}

}

