package com.Collections;

import java.util.LinkedHashSet;

public class StringWithLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		ls.add("pravs");
		ls.add("tosi");
		ls.add("shan");
		ls.add("kesh");
		ls.add("shan");
		ls.add("padma");
		ls.add("ritu");
		ls.add("shun");
		ls.add("karti");
		ls.add("sari");
		ls.add("ranji");
		ls.add("null");
		for (String x : ls) {
			System.out.println(x);
			
		}

	}

}
