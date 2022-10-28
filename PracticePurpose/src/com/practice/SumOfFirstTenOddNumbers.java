package com.practice;

public class SumOfFirstTenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		int sum=0;
		for (int i=0; i<array.length; i++) {
			if (array[i]%2==1) {
				System.out.println(array[i]);
				sum=sum+array[i];
				System.out.println(sum);
			}
		}
	}
	}

