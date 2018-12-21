package com.capgemeni.linecount;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.junit.Test;

import assignments_io.FileExistApplication;

public class LineCountApplicationTest {

	@Test
	public void testFileExistAndLinesExistsAreCorrect()
	{			
		LineCountApplication fileObject = new LineCountApplication();
		try 
		{
			int actual = fileObject.countOfNumberOfLines("C:/work/Java/New Text Document.txt");
			assertEquals(3,actual);

		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void testFileDoesNotExistAndLinesExistsAreCorrect()
	{			
		 
		LineCountApplication fileObject = new LineCountApplication();
		try 
		{
			int actual = fileObject.countOfNumberOfLines("C:/work/Java/New Document.txt");
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		 
	}
	
 
}
