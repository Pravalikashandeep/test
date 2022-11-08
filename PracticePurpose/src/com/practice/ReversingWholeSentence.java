package com.practice;

public class ReversingWholeSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "India is my country";
		char[] inputArray = s.toCharArray();
		String reverse = "";
		for (int i = inputArray.length -1; i >= 0; i--) {
			reverse = reverse + inputArray[i];
			System.out.println(reverse);
		}
	}

}
