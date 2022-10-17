package com.methods;

public class RightangulartriangularStarPrinting {
	public static void StarPrinting(int num1) {
		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		StarPrinting(10);

	}

}
