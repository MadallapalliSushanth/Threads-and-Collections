package com.sit.mycollection;

public class TestInterface {

	public static void main(String[] args) {
		
		StuInterface obj = new StuInterfaceImpl2() {
		};
		
		boolean result = obj.getStudentResult(1010);
		
		System.out.println(result);
		
	}

}
