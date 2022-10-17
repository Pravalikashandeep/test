package com.array;

import java.util.Scanner;

public class FindNumberInArrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isExist = false;
		int num[] = { 2, 3, 5, 4, 7, 6 };
		int findnumber = 5;

		for (int k = 0; k < num.length; k++) {
			if (findnumber == num[k]) {
				isExist = true;
			}
		}
		if (isExist == true) {
			System.out.println("The number Exist ");

		} else {

			System.out.println("The  number  not exist ");

		}
	}
}
