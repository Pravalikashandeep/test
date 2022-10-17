package com.Stringtypes;

public class PalindromUsingChar {
	public static boolean ispalindrome(String alphas) {
		int endindex=alphas.length()-1;
		for (int i=0; i<endindex/2; i++) {
			char firstletter = alphas.charAt(i);
			char lastletter = alphas.charAt(endindex--);
			if (firstletter!=lastletter)
				return false;
		}
		return true;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPalindrome=ispalindrome("indnii");
		if (isPalindrome) {
		System.out.println(isPalindrome);

		}
		else {
			System.out.println("is not palindrome");
		}

	}		}
