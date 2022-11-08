package com.practice;

public class SplitSentenceAsWords {
	public static String[] doubleQuotes(String Sentence) {
		String array[] = new String[5];
		String temp = "";
		int arrayIndex = 0;
		int doublequotescounter = 0;
		for (int i = 0; i < Sentence.length(); i++) {
			if (Sentence.charAt(i) == '"') {
				doublequotescounter++;
			} else if (doublequotescounter % 2 == 0 && Sentence.charAt(i) == ' ') {
				array[arrayIndex++] = temp;
				temp = "";
			} else {
				temp = temp + Sentence.charAt(i);
			}
		}
		array[arrayIndex] = temp;

		return array;
	}

	public static void main(String[] args) {
		String S = "Moon Sun \"Jupiter is a largest planet\" Pluto saturan";

		String[] ans = doubleQuotes(S);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}

}
