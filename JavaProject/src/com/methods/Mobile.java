package com.methods;

public class Mobile {
	String name;
	String colour;
	int ram;
	int prize;
	float size;
	String processor;

	public Mobile(String name1, String colour1) {

		this.name = name1;
		this.colour = colour1;
	}

	public void makeCall(long mobNumber) {
		System.out.println("calling..... "+" to 8105680969");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1 =new Mobile("samsung", "Black");
		System.out.println(m1.ram);
		System.out.println(m1.colour);
		System.out.println(m1.name);
		m1.makeCall(8105680969l);

	}
}
