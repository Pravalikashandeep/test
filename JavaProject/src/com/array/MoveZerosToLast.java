package com.array;

public class MoveZerosToLast {
	public static int[] moveZeros(int []input) {
		int temp=0;
	for(int i=0; i<input.length; i++) {
		for(int j=i+1; j<input.length; j++) {
			if(input[i]==0) {
				temp=input[i];
				input[i]=input[j];
				input[j]=temp;
				}
			}
	}
		return input;
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,0,2,10,3,0,6};
			int[] result = moveZeros(arr);
			for(int k=0; k<result.length; k++) {
				System.out.println(result[k]);
			}
			
			
		}


}
