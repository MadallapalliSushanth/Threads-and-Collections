package com.sit.mycollection;

public class Myexception extends Exception {

	String msg;
	
	Myexception(String msg){
		this.msg = msg;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "excepption is:"+msg;
	}

}
