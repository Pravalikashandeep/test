package com.practice;

public class FindVowelsPresented {
	public static boolean isvowels(String word) {
		char[] ch1 = word.toCharArray();

		for(int i=0; i<ch1.length; i++) {
		if (ch1[i]=='a' || ch1[i]=='e' || ch1[i]=='o'|| ch1[i]=='i' || ch1[i]=='u') 
			return true;
			}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch2 = "mmame ";
		if (isvowels(ch2)) {
			System.out.println("vowel is presented");
		} else {
			System.out.println("vowel is not presented");
		}
	}}
