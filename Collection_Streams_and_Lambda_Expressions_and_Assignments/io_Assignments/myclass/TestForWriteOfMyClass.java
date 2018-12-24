package com.capgemeni.myclass;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Test;

import com.capgemeni.objectReadAndWrite.Employee;
import com.capgemeni.objectReadAndWrite.EmployeeReadWrite;

/**
 * Test class For Write Of My Class
 * @author tkhandag
 *
 */
public class TestForWriteOfMyClass {

	/**
	 * 
	 */
	@Test
	public void testForWrite() 
	{
				 
		 		MyClass myclassOne = new MyClass("Tejas",102,22);
		 		MyClass myclasstwo = new MyClass("Shubham",103,21);
		 		MyClass myclassThree = new MyClass("Tushar",104,22);
		 		MyClass myclassFour = new MyClass("Rohan",105,22);
		 		MyClass myclassFive = new MyClass("Ganesh",106,22);
		 		ReadOrWrite readOrWrite = new ReadOrWrite();
 		 		ArrayList myclassArrayList = new ArrayList(); 
				myclassArrayList.add(myclassOne);
				myclassArrayList.add(myclasstwo);
				myclassArrayList.add(myclassThree);
				myclassArrayList.add(myclassFour);
				myclassArrayList.add(myclassOne);
		 		 
		 		 	 System.out.println(myclassArrayList);
		 		
		 			try {
		 				readOrWrite.writeArrayListToFile(myclassArrayList,"C:/work/Java/ArrayList_file.txt");
		 			} catch (IOException e) {
		 				 
		 				e.printStackTrace();
		 			}
		 	 
		 		  
		 	}

		 

}
