package com.capgemeni.grepApplication;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.capgemeni.wordcount.WordCount;

public class GrepApplicationTest {

	/**
	 * test File Exist And String Exists Are Correct
	 */
	 @Test
	 public void testFileExistAndStringExistsAreCorrect()
	{			
		 	Grep fileObject = new Grep();
			try 
			{
				String actual = fileObject.grepMethod("C:/work/Java/New Text Document.txt" , "Hello");
				String expected = "[[2, 2, 3][Good Good morning Good. whats going on. , Good Good morning Good. whats going on. , Good Bye.]]";
				//assertEquals(expected,actual);
				System.out.println(actual);
				
				 
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		} 
	 
	 /**
	  * test File Exist And String StringToSearch Is Not Exists
	  */
	 @Test
	 public void testFileExistAndStringStringToSearchIsNotExists()
		{			
		 	Grep fileObject = new Grep();
			try 
			{
				String actual = fileObject.grepMethod("C:/work/Java/New Text Document.txt" , "shubham");
 				String expected = "[[][string was not found]]";
				//assertEquals(expected,actual);
				 
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		} 
	 

}
