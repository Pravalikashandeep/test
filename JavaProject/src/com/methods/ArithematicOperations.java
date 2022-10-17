package com.methods;

public class ArithematicOperations {

	public static int additionOfTwoNumbers(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public static int additionOfThreeNumbers(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
	}

	public static int subtractionOfTwoNumbers(int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	}

	public static int multiplicationOfTwoNumbers(int num1, int num2) {
		int mul = num1 * num2;
		return mul;
	}

	public static int divisionOfTwoNumber(int num1, int num2) {
		int div = num1 / num2;
		return div;
	}

	public static void main(String[] args) {
		int addTwoNumber = additionOfTwoNumbers(10, 20);
		System.out.println(addTwoNumber);

		int addThreeNumber = additionOfThreeNumbers(10, 20, 30);
		System.out.println(addThreeNumber);

		int subTwoNumber = subtractionOfTwoNumbers(30, 10);
		System.out.println(subTwoNumber);

		int mulTwoNumber = multiplicationOfTwoNumbers(10, 20);
		System.out.println(mulTwoNumber);

		int divOfTwoNumber = divisionOfTwoNumber(10, 20);
		System.out.println(divOfTwoNumber);
	}

}
