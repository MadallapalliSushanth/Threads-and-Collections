package com.sit.mycollection;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashMapExample3 {

	public static void main(String[] args) {

		/**
		 * 1. Insertion Order : yyes
		 * 2. Default Sorting : No
		 * 3. Duplicate Keys Allowed: No
		 * 4. Duplicate Values Allowed: Yes
		 * 5. Null Values Allowed : yes
		 */
		
		HashMap<String,String> obj = new HashMap<String,String>();
		
		obj.put("1","d");
		obj.put("2","a");
		obj.put("3","d");
		obj.put("3","b");
		obj.put("4","c");
		obj.put("5",null);

		
		 //FOR LOOP
        System.out.println("For Loop:");
        for (Map.Entry me : obj.entrySet()) {
          System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
        }

	}

}
