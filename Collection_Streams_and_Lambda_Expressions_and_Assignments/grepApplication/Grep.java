package com.capgemeni.grepApplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
 /**
  * There is a useful utility in Unix called grep. You can use grep to list the lines in a text file that contain a certain strings. 

  * @author tkhandag
  *
  */
public class Grep {

	/**
	 * 
	 * @param filePath
	 * @param stringToSearch
	 * @return
	 * @throws IOException
	 */
	public String grepMethod(String filePath, String stringToSearch) throws IOException
	{
		int lineNumber = 0,counter =0;
		String string ;
		File file = new File(filePath);
		BufferedReader fileRead = new BufferedReader(new FileReader(filePath));		 
		ArrayList arrayListForLineNumber = new ArrayList();
		 ArrayList arrayListForLine = new ArrayList();
		while((string = fileRead.readLine()) != null)
		{
			counter++;
			 
			String [] stringArray = string.split(" ");
			for(String temporary : stringArray)
			{	
				if(temporary.equals(stringToSearch))
				{
					arrayListForLineNumber.add(counter);
					/*System.out.println("Line number is " +lineNumber);
					System.out.println("Line is: " +string);*/
					arrayListForLine.add(string);
				}
			}
		}
		if(arrayListForLineNumber.isEmpty())
		{
			arrayListForLine.add("string was not found");
		}

		return "["+arrayListForLineNumber +arrayListForLine+"]";

}
 
}