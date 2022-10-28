package com.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionWithTryAndResource {
	public static String getElementCount(String fileName, String findword) {
		String result = null;
		int count = 0;

		try (FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr)) {
			String eachLine;
			while ((eachLine = br.readLine()) != null) {
				String array[] = eachLine.split(" ");
				for (int i = 0; i < array.length; i++) {
					if (array[i].equals(findword)) {
						count++;
						try {
							int read = 58;
							System.out.println(read);
							int x = 78 / 0;
							System.out.println(x);
							break;
						} catch (Exception e) {

							e.printStackTrace();
						}
					}
				}
			}
		} catch (Exception exc) {
			exc.printStackTrace();

		}

		result = Integer.toString(count);
		return result;
	}

	public static void main(String[] args) {
		String s = getElementCount("C:\\Users\\Hp\\Desktop\\Java.txt", "file");
		System.out.println(s);
	}

}
