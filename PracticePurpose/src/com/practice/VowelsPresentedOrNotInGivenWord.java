package com.practice;

public class VowelsPresentedOrNotInGivenWord {
	public static boolean isvowelspresented(char ch1) {
		if (ch1=='a' || ch1=='e' || ch1=='o' || ch1=='i' || ch1=='u') {
		return true;	
		}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char ch1 = 't';
		 if (isvowelspresented('t')) {
			 System.out.println("vowel presented");
		 }
		 else {
			 System.out.println("vowel not presented");
		 }
	}

}
