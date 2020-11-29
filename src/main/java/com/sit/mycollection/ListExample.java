package com.sit.mycollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

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
		
		System.out.println(stuList.size());
		
		//Collections.sort(stuList);
		
		//normal for loop //FOR LOOP
        System.out.println("For Loop:");

		for (int i = 0; i < stuList.size(); i++) {
			System.out.println("normal for loop : "+stuList.get(i));
		}
		
		//enhance for loop
		for (String string : stuList) {
			System.out.println("for each"+string);
		}
		
		//iterator interface
		Iterator it = stuList.iterator();
		while(it.hasNext()) {
			System.out.println("iteraot"+it.next());
		}
				
		//normal while loop
		System.out.println("While Loop"); 		
	      int count = 0; 		
	      while (stuList.size() > count) {
		 System.out.println("while:"+stuList.get(count));
	         count++;
	      }
	}

}
