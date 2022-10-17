package com.Starprinting;

public class NumericalPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
			for (int i = 0; i < 10 ; i++) {
				for (int j = 0; j < i; j++) {

					System.out.print(++counter + " ");
				}
				System.out.println();

			}


	}

}
