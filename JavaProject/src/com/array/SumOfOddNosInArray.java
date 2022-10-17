package com.array;

public class SumOfOddNosInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int numbers[] = { 7, 8, 9, 4, 5, 6 };

		System.out.println(numbers.length);
		for (int n = 0; n < numbers.length; n++) {
			if (numbers[n] % 2 != 0) {
				sum = sum + numbers[n];
			}
		}

		System.out.println(sum);
	}
}
