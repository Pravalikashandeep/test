package com.methods;

public class PyramidTriangularStarPrinting {
	public static void pyramidTriangle(int number) {
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 10; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pyramidTriangle(5);
	}
}
