package com.methods;

public class StarPrinting {
	public static void starprinting(int num) {
		for (int i=0; i<num; i++) {
			for (int j=0; j<num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
	 starprinting(8);

	}

}
