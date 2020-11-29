package com.sit.mycollection;

import java.io.IOException;

public class Excptions {
	public static void main(String[ ] args) {
		try {
		    int[] myNumbers = {1, 2, 3};
		    //System.out.println(myNumbers[9]); // error!
		    try {
		    	
		    }catch(Exception e1) {
		    	try {
		    		
		    	}catch(Exception e) {
		    		
		    	}
		    	
		    	finally {
		    		System.out.println("finallyy");
		    	}
		    }finally {
		    	
		    }
		}finally {
    		System.out.println("finallyyooooooo");
    	}

	    int i=10;
	    int j=20;
	    int k = i+j;
	    System.out.println(k);
	    
	    String s = null;
	    try {
	    	//s.trim();
	    	throw new Myexception("error1");
	    }
	    catch (Myexception e) {
	    	e.printStackTrace();
		}
	    
	    
	    int i1 = 100;
	    System.out.println(i1);
	  }

}
