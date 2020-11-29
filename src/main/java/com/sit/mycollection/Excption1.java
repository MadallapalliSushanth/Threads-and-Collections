package com.sit.mycollection;

public class Excption1 {
	public static void main(String[ ] args) {
	    try {
	      int[] myNumbers = {1, 2, 3};
	      System.out.println(myNumbers[6]);
	    } catch (Exception e) {
	      System.out.println("minnse me");
	      try {
	          int a[] = new int[2];
	          System.out.println("Access element three :" + a[3]);
	       } try {
	           int a[] = new int[2];
	           System.out.println("Access element three :" + a[3]);
	        } catch (ArrayIndexOutOfBoundsException e1) {
	           System.out.println("Exception thrown  :" + e1);
	        }
	        System.out.println("Out of the block"); {
	          System.out.println("Exception thrown  :" + e);
	       }
	       System.out.println("Out of the block");
	    }
	  }
}
