package com.practice;

public class LetterCountsInAString {
	public static int getCountOfe(String sentence) {
		int count = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == 'e') {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "selenium web drive";
		int stg = getCountOfe(s);

		System.out.println(stg);

	}

}
