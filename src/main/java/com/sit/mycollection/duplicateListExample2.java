package com.sit.mycollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class duplicateListExample2 {

	public static void main(String[] args) {
		
		List<String> stuList = new ArrayList<String>();
		/**
		 * 1. Insertion Order : Yes
		 * 2. Default Sorting : No
		 * 3. Duplicate Elements Allowed: Yes
		 * 4. null values : Yes
		 */
		stuList.add(0,"pavan");
		stuList.add("abc");
		stuList.add("sushanth");
		stuList.add("teja");
		stuList.add("teja");
		stuList.add("varshith");
		//stuList.add(null);
		//stuList.add(null);
		//stuList.add("");
		
		Set<String> stuset = new HashSet<String>(stuList);
		
		List<String> witOutDepList = new ArrayList<String>(stuset);
		
		
		System.out.println(stuList.size());
		
		//Collections.sort(stuList);
		
		//normal for loop //FOR LOOP
        System.out.println("For Loop:");
      

		//enhance for loop
		for (String string : stuList) {
			System.out.println("for each"+string);
		}
		
		
		//enhance for loop
				for (String string : witOutDepList) {
					System.out.println("for each with duplicate "+string);
				}
	}

}
