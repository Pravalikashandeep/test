package com.Stringtypes;

public class StringTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = " welcome to class ";
		String s2 = "WELCOME to class";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf("e"));
		System.out.println(s1.contains("welcome"));
		System.out.println(s1.concat(s2));
		System.out.println(s2.format(s1));
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.replace("welcome", "Bye"));
		System.out.println(s1.trim());
		System.out.println(s1.startsWith(" welcome"));
		System.out.println(s1.endsWith(" "));
		System.out.println(s1.substring(1));

	}
}
