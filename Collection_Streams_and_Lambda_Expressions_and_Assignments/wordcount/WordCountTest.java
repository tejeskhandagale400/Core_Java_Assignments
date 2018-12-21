package com.capgemeni.wordcount;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.capgemeni.linecount.LineCountApplication;

public class WordCountTest
{
	
	@Test
	public void testFileExistAndWordsExistsAreCorrect()
	{			
		WordCount fileObject = new WordCount();
		try 
		{
			int actual = fileObject.countOfNumberOfWords("C:/work/Java/New Text Document.txt");
			assertEquals(9,actual);

		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFileDoesNotExistAndWordsExistsAreCorrect()
	{			
		WordCount fileObject = new WordCount();
		try 
		{
			int actual = fileObject.countOfNumberOfWords("C:/work/Java/Text Document.txt");
			assertEquals(9,actual);

		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	 
 
}
