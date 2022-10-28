package com.data;

public class ChoclateCount {

	public static int getChochlatecount(int rupees) {
		int noOfChochlate = rupees / 3;
		int noOfWrappers = noOfChochlate;
		while (noOfWrappers >= 3) {
			int extraChochlates = noOfWrappers / 3;
			noOfChochlate = noOfChochlate + extraChochlates;
			int extrawrapper = noOfWrappers % 3;
			noOfWrappers = extraChochlates + extrawrapper;
		}

		return noOfChochlate;
	}

	public static void main(String[] args) {
		System.out.println(getChochlatecount(100));

	}
}
