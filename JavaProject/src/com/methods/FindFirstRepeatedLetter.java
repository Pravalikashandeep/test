package com.methods;

public class FindFirstRepeatedLetter {
	public static char findLetter(String letter) {
		char[] let=letter.toCharArray();
		for (int i=0; i<let.length; i++) {
		for (int j=i+1; j<let.length; j++) {
		if (let[i]==let[j]) {
			return let[i];
		}
		}
		} return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findLetter("geekforgeeks"));
		
	}

}
