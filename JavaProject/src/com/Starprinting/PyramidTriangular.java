package com.Starprinting;

public class PyramidTriangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++)
		
			{

				System.out.print("*");
			}
			System.out.println();
		}
	}
}
