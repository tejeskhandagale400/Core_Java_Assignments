package com.capgemeni.myclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.capgemeni.objectReadAndWrite.Employee;

public class ReadOrWrite {
	/**
	 *method to write objet in file
	 * @param myclassArrayList
	 * @param path
	 * @throws IOException
	 */
	public void writeArrayListToFile(ArrayList myclassArrayList , String path) throws IOException 
	{
		FileOutputStream fout = new FileOutputStream(path);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(myclassArrayList);
		out.close();
		fout.close();

	}
	
	/**
	 * Method to read object from file
	 * @param path
	 * @return
	 * @throws Exception
	 */
	public ArrayList readArrayListFromFile(String path) throws Exception  
	{
		 ArrayList readList =null;
		 if((new File(path).exists()))
		 {
			 FileInputStream fis = new FileInputStream(path);
			 ObjectInputStream in = new ObjectInputStream(fis); 
			 readList = (ArrayList)in.readObject();
			  
			 in.close();
			 fis.close();
		 }
		 else if(!(new File(path).exists()))
		 { throw new FileNotFoundException();}
		 else {
			 throw new Exception();
		 }
		return readList;
			  
		  
	}


}
