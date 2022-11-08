package com.practice;

public class ExceptionWithTryAndCatchFinalWithReturn {
	public static int system(int result) {
	System.out.println("hello");try
	{
		int i = 10 / 0;
		System.out.println("after exception");
	}
	 catch (Exception e) {

			e.printStackTrace();
			
			return result;
		}

	finally
	{
	System.out.println("finally");

	return result;
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exceptiontutorial c = new Exceptiontutorial();
		c.system();
		System.out.println("hey");
		System.out.println(system(10));

	}

}
