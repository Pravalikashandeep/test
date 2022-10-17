package com.methods;

public class SumOfNumber {
	public static int sumOfNumbers(int []array) {
		int sum=0;
	
		for (int i=0; i<array.length; i++) {
		if (array[i]%2==0)
		{
			sum=sum+array[i];
		}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {2,3,5,6,4,7,89,52,12,14,74};
		int sumOfEvenNumbers=sumOfNumbers(array);
		System.out.println(sumOfEvenNumbers);

	}

}
