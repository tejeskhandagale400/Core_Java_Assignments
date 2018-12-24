package com.capgemeni.objectReadAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *  class to initialize object of employee
 * @author tejas
 *
 */
public class EmployeeReadWrite
{
	/**
	 *method to write objet in file
	 * @param employee
	 * @param path
	 * @throws IOException
	 */
	public void writeObjectToFile(Employee employee , String path) throws IOException 
	{
		

	}
	
	/**
	 * Method to read object from file
	 * @param path
	 * @return
	 * @throws Exception
	 */
	public Employee readObjectFromFile(String path) throws Exception  
	{
		 Employee readEmployee =null;
		 if((new File(path).exists()))
		 {
			 FileInputStream fis = new FileInputStream(path);
			 ObjectInputStream in = new ObjectInputStream(fis); 
			 readEmployee = (Employee)in.readObject();
			  
			 in.close();
			 fis.close();
		 }
		 else if(!(new File(path).exists()))
		 { throw new FileNotFoundException();}
		 else {
			 throw new Exception();
		 }
		return readEmployee;
			  
		  
	}

	public void writeArrayListToFile(ArrayList myclassArrayList, String path) throws IOException 
	{
	 
		FileOutputStream fout = new FileOutputStream(path);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(myclassArrayList);
		out.close();
		fout.close();
	}
}
	
	

