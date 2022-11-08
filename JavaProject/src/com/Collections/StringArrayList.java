package com.Collections;

import java.util.ArrayList;

public class StringArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("pravs");
		al.add("toshi");
		al.add("shan");
		al.remove(0);
		for (String x : al) {
			System.out.println(x);
			
		}
		

	}

}
