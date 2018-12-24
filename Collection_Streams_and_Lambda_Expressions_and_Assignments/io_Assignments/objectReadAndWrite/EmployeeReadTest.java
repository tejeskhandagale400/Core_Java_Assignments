package com.capgemeni.objectReadAndWrite;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
/**
 * Test for checking the read of object employee from file
 * @author Tejas
 *
 */
public class EmployeeReadTest {

	Employee expected = new Employee(101, "TejaS", 20000);

	/**
	 * test For Employee Read
	 */
	@Test
	public void testForEmployeeRead() {
		EmployeeReadWrite readOrWrite = new EmployeeReadWrite();
		String path ="C:/work/Java/Employee.txt";
		Employee actual =null;
		try 
		{
			  actual = readOrWrite.readObjectFromFile(path);
			  assertEquals(expected.toString(),actual.toString());

		} catch (Exception e) {
			 
			e.printStackTrace();
		}
 	}

}
