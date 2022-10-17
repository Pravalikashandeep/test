package com.methods;

public class NumericalPrintingInSequence {
	public static int printNuberAsStartPattern(int numericals) {
		int count = 0;
		for (int i = 0; i < numericals; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(++count + " ");
			}
			System.out.println();
		}
		return numericals;
	}

	public static void main(String[] a) {

		printNuberAsStartPattern(15);
	}
}
