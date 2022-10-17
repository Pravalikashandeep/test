package com.methods;

public class SumOfElementsInArray {
	public static int sumOfArray (int[] array) {
		int sum=0;
		for (int i=0; i<array.length; i++) {
			sum=sum+array[i];
			
		}
		return sum;
	}
       
	public static void main(String[] args) {
		int array[]= {2, 8, 6, 4, 5, 7, 1};
	  int sum=sumOfArray(array);
	  System.out.println(sum);
	  
		

	}

}
