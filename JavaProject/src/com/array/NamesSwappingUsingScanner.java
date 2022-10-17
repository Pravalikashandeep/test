package com.array;

import java.util.Scanner;

public class NamesSwappingUsingScanner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter length of array");
		int arrayLength = sc.nextInt();
		String arr[] = new String[arrayLength];
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter the find name ");
		String findname = Scan.nextLine();
		for (int k = 0; k < arr.length; k++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the name " + k);
			String name = scanner.nextLine();
			arr[k] = name;
			
			}
		for (int k = 0; k < arr.length; k++) {
			
			if (findname.equals (arr[k])) { 
				
				count++;

				
		}
		
		 
		}
		System.out.println(count);
	
	}
}