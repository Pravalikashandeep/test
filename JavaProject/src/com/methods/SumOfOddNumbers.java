package com.methods;

public class SumOfOddNumbers {
	
	public static void main(String[] args) {
		int addition = sumOfOddNumber(1,10);
		System.out.println(addition);
	}
	
	public static int sumOfOddNumber(int startNo,int endNumber) {
		int sum = 0;
		if(startNo > endNumber)
		{
			int temp = startNo;
			startNo = endNumber;
			endNumber = temp;
		}
		for (int i = startNo; i < endNumber; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
			}
		}
		return sum;
	}

}