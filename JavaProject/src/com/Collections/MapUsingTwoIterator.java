package com.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapUsingTwoIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> personList = new HashMap<Integer, String>();
		personList.put(01, "Shandeep");
		personList.put(02,"Pravalika");
		personList.put(03, "Toshan");
		for (Integer stg : personList.keySet()) {
			System.out.println("Serial Num: "+stg);
		}
		System.out.println();
		for (String string : personList.values()) {
			System.out.println("Name : "+string);
			
		}

	}

}
