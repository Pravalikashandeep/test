package com.methods;

public class SwapNumbers {
	public static void swapNumber(int a, int b) {
		int  temp=0;
		
		 temp=  a;
		 a=b;
		 b = temp;
			System.out.println(a+","+b);

	}

	public static void main(String[] args) {
		swapNumber(10,20);}
}
