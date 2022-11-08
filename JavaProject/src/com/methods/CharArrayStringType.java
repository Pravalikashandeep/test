package com.methods;

public class CharArrayStringType {
	public static String reverseName(String name) {
		char[] array1 = name.toCharArray();
		String reverse = "";
		for (int i = array1.length - 1; i >= 0; i--) {
			reverse = reverse + array1[i];
		}
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reversedString = reverseName("pravalika is a testor");
		System.out.println(reversedString);

	}
}
