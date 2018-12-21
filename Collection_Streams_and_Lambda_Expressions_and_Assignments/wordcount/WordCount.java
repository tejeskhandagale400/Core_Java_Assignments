package com.capgemeni.wordcount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public int countOfNumberOfWords(String filePath) throws IOException 
	{
		int wordCounter=0;
		String string;
		File file = new File(filePath);
		BufferedReader fileRead = new BufferedReader(new FileReader(filePath));		 

		while((string = fileRead.readLine()) != null)
		{
			String [] stringArray = string.split(" ");
			wordCounter += stringArray.length;
			System.out.println(string);
		}
	 
		return wordCounter;
	}

}
