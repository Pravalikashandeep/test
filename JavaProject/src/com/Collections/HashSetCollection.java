package com.Collections;

import java.util.HashSet;

public class HashSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(10);
		hs.add(50);
		hs.add(60);
		hs.remove(10);
		for (Integer x : hs) {

			System.out.println(x);
		}

	}

}
