package com.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> name = new HashMap<>();
		name.put("Name", "pravalika");
		name.put("Num", "20");
		name.put("City", "Bangalore" );
		name.put("Native", "Kuppam");
		name.put("State", "AP");
		name.put("Qualification", "B.Tech");
		for (Entry<String, String> string : name.entrySet()) {
			System.out.println(string.getKey()+ " : " + string.getValue());

		}
	}

}
