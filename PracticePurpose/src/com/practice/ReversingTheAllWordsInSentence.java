package com.practice;

public class ReversingTheAllWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="India is my co untry";
		String[] array=s.split(" ");
		String st="";
		for(int i=array.length-1; i>=0; i--) {
			st=st+array[i].concat(" ");
		}
			System.out.println(st);
	}

}
