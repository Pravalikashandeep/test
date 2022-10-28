package com.data;

public class FindMissingNumber {

	public static int findMissingNumberInArray(int[] inputArray, int lastNumber) {
		int totalOfn = (lastNumber * (lastNumber + 1)) / 2;
		int sum = 0;
		for (int i = 0; i < inputArray.length; i++) {
			sum = sum + inputArray[i];
		}
		return totalOfn - sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[] = { 1, 3, 4, 5, 6, 7, 8, 9, 10 };
		int result = findMissingNumberInArray(number, 10);
		System.out.println(result);
	}

}
