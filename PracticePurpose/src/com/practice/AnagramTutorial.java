package com.practice;

import java.util.Arrays;

public class AnagramTutorial {

	public static void main(String[] args) {
		String s1 = "cat";
		String s2 = "tac";
		if(s1.length()==s2.length()) {
			char[] c1 =s1.toCharArray();
			char[] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			boolean result=Arrays.equals(c1, c2);
			if(result==true) {
				System.out.println("String is anagram");
			}
			else
			{
				System.out.println("string is not anagram");
			}
		}

	}

}
