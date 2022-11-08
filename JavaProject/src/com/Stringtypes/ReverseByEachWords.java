 package com.Stringtypes;

import com.methods.CharArrayStringType;

public class ReverseByEachWords {
	public static String reverseByEachWord(String sentence) {
		String result = "";
		String []array = sentence.split(" ");
		for (int i=0; i<array.length; i++) {
		String reverseWord= CharArrayStringType.reverseName(array[i]);
		result=result+reverseWord.concat(" ");
		
		}
		return result;
	}
		
		public static void main(String[] a) {
			String reverse=reverseByEachWord("india is my country");
			 System.out.println(reverse);
		}
	}


