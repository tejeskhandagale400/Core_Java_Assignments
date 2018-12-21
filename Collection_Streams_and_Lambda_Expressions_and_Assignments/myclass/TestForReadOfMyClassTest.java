package com.capgemeni.myclass;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.capgemeni.objectReadAndWrite.Employee;
import com.capgemeni.objectReadAndWrite.EmployeeReadWrite;

/**
 * Test For Read Of My Class Test
 * @author tkhandag
 *
 */
public class TestForReadOfMyClassTest 
{
	/**
	 * test For My class Read
	 */
		@Test
		public void testForMyclassRead() 
		{
			MyClass myclassOne = new MyClass("Tejas",102,22);
			MyClass myclasstwo = new MyClass("Shubham",103,21);
			MyClass myclassThree = new MyClass("Tushar",104,22);
			MyClass myclassFour = new MyClass("Rohan",105,22);
			MyClass myclassFive = new MyClass("Ganesh",106,22);
			
			ArrayList expected = new ArrayList();	 	 
			expected.add(myclassOne);
			expected.add(myclasstwo);
			expected.add(myclassThree);
			expected.add(myclassFour);
			expected.add(myclassOne);
		 	
			ArrayList arrayList =  new ArrayList();
			
			ReadOrWrite readOrWrite = new ReadOrWrite();
			String path ="C:/work/Java/ArrayList_file.txt";
			 
			try 
			{
				arrayList = readOrWrite.readArrayListFromFile(path);
				  System.out.println(arrayList);

			} catch (Exception e) 
			{
				 
				e.printStackTrace();
			}
	 	 
	}

}
