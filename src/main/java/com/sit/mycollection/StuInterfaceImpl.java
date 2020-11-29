package com.sit.mycollection;

public  class StuInterfaceImpl extends SampleAbstractClass implements StuInterface  {


	public boolean getStudentResult(int rollNo) {
		boolean result = false;
		if(rollNo == 1) {
			return true;
		}else {
			return result;
		}
	}

	@Override
	void display() {
		System.out.println("aa");
		
	}

	@Override
	void display1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void display2() {
		// TODO Auto-generated method stub
		
	}
	

}
