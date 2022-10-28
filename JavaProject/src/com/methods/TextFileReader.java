package com.methods;

import java.io.BufferedReader;
import java.io.FileReader;

public class TextFileReader {
	public static void main(String[] args)throws Throwable {
		FileReader fr=new FileReader("C:\\Users\\Hp\\Desktop\\Java.txt");
		BufferedReader br =  new BufferedReader(fr);
		String findword= "file";
		String eachline;
		int count=0;
		while((eachline=br.readLine())!=null){
		String array[]= eachline.split(" ");
		for(int i=0; i<array.length; i++) {
			if (array[i].equals(findword)) {
			count++;
			}
		}
		}
	System.out.println(count);
	
			fr.close();
			br.close();
		

	}
}
