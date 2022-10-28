package com.practice;

public class StarPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<8; i++) {
			for (int j=0; j<8-i+1; j++) {
				System.out.print(" ");
				}
			for (int k=0; k<2*i+1; k++){
			System.out.print("*");
			}
			System.out.println();
		}

	}

}
