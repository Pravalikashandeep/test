package com.practice;

import java.util.Arrays;

public class IntegerAnagram {

	private static final String Char = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int x=12;
				int y=31;
		String c= Integer.toString(x);
		String d=Integer.toString(y);
		if (c.length()==d.length()) {
			char[]  s=c.toCharArray();
			char[]  u=d.toCharArray();
			Arrays.sort(s);
			Arrays.sort(u);
			boolean result=Arrays.equals(s, u);
			if (result==true) {
				System.out.println("Given two integers are Anagram");
			}
			else {
				System.out.println("Given two integers are not Anagram");
			}
			
		}
	
		
		

	}

}
