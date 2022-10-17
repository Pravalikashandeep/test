package com.methods;

public class SecondthTable {
	public static int secondthTable(int num) {
		for (int i = 1; i < 11; i++) {
			int k = i * 2;
			System.out.println(i + "*" + "2" + "=" + k);
		}
		return num;
	}

	public static void main(String[] args) {
		int i = 1;
		secondthTable(i);
	}
}