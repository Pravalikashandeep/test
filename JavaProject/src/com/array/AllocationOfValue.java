package com.array;

public class AllocationOfValue {

	public static void main(String[] args) {
		int array[] = new int[6];
		array[0] = 12;
		array[1] = 22;
		array[2] = 13;
		array[3] = 31;
		array[4] = 40;
		array[5] = 50;
		for (int i = 0; i < array.length; i++) {
			array[i]=10*i;
			System.out.println("Assigned numbers "+array[i]);

		}

	}

}
