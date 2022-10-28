package com.practice;

public class PresentedVowelsOrNot {
	public static boolean isVowelExist(char ch) {
		if (ch=='a' || ch=='e' || ch=='o' || ch=='l' || ch=='u') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	if (isVowelExist('o')) {                                                                                                          
		System.out.println("vowel is presented");
	}else {
		System.out.println("vowel not presented");
	}

}}
