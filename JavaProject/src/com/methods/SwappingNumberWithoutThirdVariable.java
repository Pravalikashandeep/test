package com.methods;

public class SwappingNumberWithoutThirdVariable {

	public static void main(String[] args) {
		int x=10, y=20;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(x+" x value swapped to y value as "+y);

	}

}
