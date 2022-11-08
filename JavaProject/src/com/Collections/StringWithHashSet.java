package com.Collections;

import java.util.HashSet;

public class StringWithHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("pravs");
		hs.add("toshi");
		hs.add("shan");
		hs.add("ritu");
		hs.add("padma");
		hs.add("keshi");
		hs.add("padma");
		hs.add("null");
		for (String a : hs) {
			System.out.println(a);
			
		}
	}

}
