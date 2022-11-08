package com.practice;

import java.io.CharArrayReader;

public class ReversingAllWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "India is my country";
		for (int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

	}

}
