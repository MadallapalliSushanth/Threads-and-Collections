package com.sit.mycollection;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		/**
		 * 1. Insertion Order : No
		 * 2. Default Sorting : No
		 * 3. Duplicate Keys Allowed: No
		 * 4. Duplicate Values Allowed: Yes
		 * 5. Null Values Allowed : No
		 */
		
		Hashtable<String,String> obj = new Hashtable<String,String>();
		
		obj.put("1","d");
		obj.put("2","a");
		obj.put("3","d");
		obj.put("3","b");
		obj.put("4","c");
		obj.put("5","c");

		
		Enumeration en = obj.keys();
				
		while (en.hasMoreElements()) {
			String  key = (String) en.nextElement();
			System.out.println("key:"+key+"value:"+obj.get(key));
		}

	}

}
