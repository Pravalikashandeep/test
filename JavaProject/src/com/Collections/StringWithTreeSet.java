package com.Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class StringWithTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("tosi");
		ts.add("pravs");
		ts.add("shandeep");
		ts.add("padma");
		ts.add("shunmugam");
		ts.add("keshiya");
		ts.add("karthik");
		ts.add("ritu");
		ts.add("sarik");
		ts.add("null");
		for (String x : ts) {
			System.out.println(x);

		}
	}
}
