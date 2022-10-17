package com.evenodd;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the text");
		int no = scanner.nextInt();

		if ((no%2 != 0) && (no/2 ==1)) {

			System.out.println("the given number is even");
		}

		else {

			System.out.println("the given number is odd");
		}

	}

}
