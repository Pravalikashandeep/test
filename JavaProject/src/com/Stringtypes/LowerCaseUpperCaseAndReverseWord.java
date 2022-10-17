package com.Stringtypes;

public class LowerCaseUpperCaseAndReverseWord {
	public static String reveseWord(String input) {
		char[] inputArray = input.toCharArray();
		String reverse = "";
		for (int i = inputArray.length - 1; i >= 0; i--) {
			reverse = reverse + inputArray[i];
		}
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reversecountry = reveseWord("Australia");
		String s1 = "T2o Worldcup Happeing in Australia";
		System.out.println(reversecountry);
		String s3 = s1.replace("Australia", reversecountry);
		String s2 = s3.toLowerCase();
		System.out.println(s2);

	}
}
