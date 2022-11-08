package com.array;

public class PrintDuplicatesInArray {
	public static void printDuplicates(int[] arr) {
		for (int i = 0; i < arr.length ; i++) {
			for (int j = i+1; j < arr.length ; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}}}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 1, 2, 5, 6,6, 4, 2 };
		printDuplicates(array);
		
	}

}
