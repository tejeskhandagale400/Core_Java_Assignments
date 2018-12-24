package com.capgemeni.objectReadAndWrite;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.junit.Test;
/**
 * Test for checking the write of object employee from file
 * @author Tejas
 *
 */
public class EmployeeWriteTest 
{

	@Test
	public void test()
	{
		Employee employee = new Employee(101, "TejaS", 20000);
		EmployeeReadWrite readOrWrite = new EmployeeReadWrite();
		 
			try {
				readOrWrite.writeObjectToFile(employee,"C:/work/Java/Employee.txt");
			} catch (IOException e) {
				 
				e.printStackTrace();
			}
	 
		  
	}

}
