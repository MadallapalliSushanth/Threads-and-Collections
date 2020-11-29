package com.sit.mycollection;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		/**
		 * 1. Insertion Order : Yes
		 * 2. Default Sorting : No
		 * 3. Duplicate Elements Allowed: Yes
		 * 4. null values : Yes
		 */
		
		List<String> obj = new Vector<String>();
		
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
