package com.methods;

public class Palindrom {
	public static boolean isPalindrom(String name) {
		String reverse = CharArrayStringType.reverseName(name);
		if (name.equalsIgnoreCase(reverse)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		boolean isPalindrom = isPalindrom("abc");
		if (isPalindrom) {
			System.out.println("is Palindrom");

		} else {
			System.out.println("not palindrome");
		}
	}
}
