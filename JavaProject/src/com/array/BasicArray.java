 package com.array;

public class BasicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		int nos[] = { 7, 8, 9, 4, 5, 6 };

		System.out.println(nos.length);
		for (int n = 0; n < nos.length; n++) {
			sum = sum + nos[n];
			System.out.println(nos[n]);
		}

		System.out.println(sum);

	}

}
