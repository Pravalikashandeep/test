package com.array;

import java.util.Scanner;

public class ArraySwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter array value");
		int length = sc.nextInt();
		int arr[] = new int[length];
		for (int k = 0; k < arr.length; k++) {
			System.out.println("enter the element " + k + "th index");
			arr[k] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1 + i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];

					arr[j] = temp;
				}
			}

			System.out.println(arr[i]);

		}

	}

}
