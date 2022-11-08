package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class Students {
	int id;
	String name;

	Students(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Students> studentList = new ArrayList<Students>();
		Students s1 = new Students(1, "Aravind ");
		Students s2 = new Students(2, "Pravalika ");
		Students s3 = new Students(3, "dharani ");
		Students s4 = new Students(4, "ritu ");
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		for (Students s : studentList) {
			if (s.name.startsWith("r")) {
				System.out.println(s.id);
				System.out.println(s.name);
			}
		}
	}

}
