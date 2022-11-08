package com.practice;

public class ReversingSentenceByWords {
	public static String reverseSentence(String sentence) {
		String[] arr = sentence.split(" ");
		String s = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			s = s + arr[i].concat(" ");
		}
		return s;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stg = "selenium web driver";
		String st = reverseSentence(stg);
		System.out.println(st);
	}

}
