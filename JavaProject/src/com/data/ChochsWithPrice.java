package com.data;

public class ChochsWithPrice {
	public static int getChochsCount(int rupees, int priceOfChoch, int wrappers ) {
		int noOfChoch=rupees/priceOfChoch;
		int noOfWrapper=noOfChoch;
		while(noOfWrapper>=wrappers) {
			int extrachoch=noOfWrapper/wrappers;
			noOfChoch=noOfChoch+extrachoch;
			int extraWrapper=noOfWrapper%wrappers;
			noOfWrapper=extrachoch+extraWrapper;
		}
		return noOfChoch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getChochsCount(100,3,4));

	}

}
