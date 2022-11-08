package com.Collections;

import java.util.LinkedHashSet;

public class LinkedHashSetTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lh= new LinkedHashSet<Integer>();
		lh.add(89);
		lh.add(52);
		lh.add(80);
		lh.add(80);
		lh.add(50);
		lh.add(0);
		for (Integer a : lh) {
			System.out.println(a);
			
		}

	}

}
