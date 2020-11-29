package com.sit.mycollection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		/**
		 * 1. Insertion Order : No
		 * 2. Default Sorting : Yes
		 * 3. Duplicate Elements Allowed: No
		 * 4. null values : Yes
		 */
		
		Set<String> obj = new HashSet<String>();
		
		obj.add("d");
		obj.add("a");
		obj.add("d");
		obj.add("b");
		obj.add("c");
		obj.add("c");
		obj.add(null);
		
		for (String string : obj) {
			System.out.println("for each--> "+string);
		}

	}

}
