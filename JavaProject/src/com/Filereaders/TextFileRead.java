package com.Filereaders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileRead {

	public static String getElementCount(String fileName, String findword) throws IOException {
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		String eachLine;
		int count = 0;
		while ((eachLine = br.readLine()) != null) {
			String array[] = eachLine.split(" ");
			for (int i = 0; i < array.length; i++) {
				if (array[ i].equals(findword)) {
					count++;
					try {
						int read = 58;
						System.out.println(read);
						int x=78/0;
						System.out.println(x);
					}
					catch 
						(Exception e){
					
						e.printStackTrace();
					}
					finally {
					System.out.println("Am here");
				}}
			}
		}
		fr.close();
		br.close();
		String result=Integer.toString(count);
		return result;
	}

	public static void main(String[] args)throws Throwable {
 String s=getElementCount("C:\\Users\\Hp\\Desktop\\Java.txt","file");
		System.out.println(s);
	}

}
