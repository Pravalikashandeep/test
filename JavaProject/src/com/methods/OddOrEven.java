package com.methods;

import java.util.Scanner;

public class OddOrEven {

	public static boolean isExist(int result) {
		return result % 2 == 0;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int number = sc.nextInt();
		boolean number1 = isExist(number);

		if (number1) {
			System.out.println(number + " number is even number");
		} else {
			System.out.println(number + "  is odd number");
		}

	}
}
