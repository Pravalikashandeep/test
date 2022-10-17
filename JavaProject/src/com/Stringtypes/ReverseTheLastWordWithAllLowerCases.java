package com.Stringtypes;

public class ReverseTheLastWordWithAllLowerCases {
	public static String allLowerCases(String input) {
		String result = "";
		String lowercaseInput = input.toLowerCase();
		String[] array = lowercaseInput.split(" ");
		int endindex = array.length - 1;
		for (int i = 0; i <= endindex; i++) {
			if (i == endindex) {
				String lastWord = array[i];
				char[] wordArray = lastWord.toCharArray();
				String reverseWord = "";
				for (int j = wordArray.length - 1; j >= 0; j--) {
					reverseWord = reverseWord + wordArray[j];
				}
				System.out.println( result +  reverseWord);
			} else {
				result = result + array[i].concat(" ");
			}

		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String output = allLowerCases("T20 Worldcup Happening in Australia");
		System.out.println(output);

	}

}
