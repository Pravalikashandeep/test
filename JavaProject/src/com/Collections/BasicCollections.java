package com.Collections;

import java.util.ArrayList;

public class BasicCollections {

	public static void main(String[] a) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(105);
		al.add(87);
		al.add(76);
		al.add(8);
		al.add(10);
		al.add(96);
		al.add(52);
		System.out.println("size is :"+al.size());
		al.remove(5);
		for (Integer x : al) {
			System.out.println(x);
		}

	}

}
