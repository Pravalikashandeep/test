package com.evenodd;

import java.util.Scanner;

public class Equals {

	public static void main(String[] args) {
		Scanner Scanner=new Scanner(System.in);
		System.out.print("enter any name");
		String name= Scanner.nextLine();
		
		if (name.equals("puspa")) {
			
			System.out.println("the give name is "+name);
			
		}
		
		else if (name.equals("NTR")) {
			
			System.out.println("the given name is"+name);
		}
		else {
			
			System.out.println("given name");
		}
		
		
		
		
		
	}

}
