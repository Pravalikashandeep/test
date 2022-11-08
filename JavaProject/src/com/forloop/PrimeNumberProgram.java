package com.forloop;

public class PrimeNumberProgram {
	public static boolean isPrime(int number) {
		for(int i=0; i<number; i++) {
			if(number%i==0) {
				return true;
				
			}}
		return false;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(45));
		
		

	}

}
