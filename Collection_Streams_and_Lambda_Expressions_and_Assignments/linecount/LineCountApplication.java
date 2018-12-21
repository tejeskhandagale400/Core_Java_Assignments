package com.capgemeni.linecount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineCountApplication 
{

	public int countOfNumberOfLines(String filePath) throws IOException
	{
		BufferedReader file = new BufferedReader(new FileReader(filePath));
		int lineCounter = 0;
		while(file.readLine() != null)
		{
			lineCounter++;
		}
		file.close();
		return lineCounter;
	}
	
	

}
