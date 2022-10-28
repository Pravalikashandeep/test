package Typesoftypecasting;

public class Factorial {

	public static int facto(int number) {
		int fact=1;
		for (int i=1; i<=number; i++) {
			fact=fact*i;
			}
		return fact;
	}
		public static void main(String[] agrs) {
			int output= facto(5);
     System.out.println(output);
	}

}
