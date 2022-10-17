package com.operators;

import java.util.Scanner;

public class AndOrOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the text");
		int no = scanner.nextInt();

		if (no <= 0) {
			System.out.println("the given no is high");
		} else if ((no >= 0) && (no <= 30)) {
			System.out.println("no is true");
		} else if ((no >= 33) && (no <= 22)) {
			System.out.println("given no is negative");

		} else {
			System.out.println("no is 22");
		}

	}

}
