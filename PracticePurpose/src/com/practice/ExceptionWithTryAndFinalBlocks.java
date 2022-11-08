package com.practice;

public class ExceptionWithTryAndFinalBlocks {
	public void system() {
		System.out.println("hello");
		try {
			int i = 10 / 0;
			System.out.println("after exception");
		}

		finally {
			System.out.println("finally");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exceptiontutorial c = new Exceptiontutorial();
		c.system();
		System.out.println("hey");

	}

}
