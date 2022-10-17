package com.array;

public class HowMany5S {

	public static void main(String[] args) {
	int array[]= {5,2,3,4,5,5,5,6,7};
	int findnumber= 5, total =0;
	for(int i=0; i<array.length; i++) {
		if (findnumber==array[i]) {
			total++;
			}}
	System.out.println("Number "+findnumber+" presented "+total+" times");

	}

}
