package com.sit.mycollection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public abstract  class sortedSetExample2 extends SampleAbstractClass{

	public static void main(String[] args) {

		/**
		 * 1. Insertion Order : No
		 * 2. Default Sorting : Yes
		 * 3. Duplicate Elements Allowed: No
		 */
		
		SortedSet<String> obj = new TreeSet<String>();
		
		obj.add("d");
		obj.add("a");
		obj.add("d");
		obj.add("b");
		obj.add("c");
		obj.add("c");
		
		for (String string : obj) {
			System.out.println("for each--> "+string.toLowerCase());
		}

	}



}
