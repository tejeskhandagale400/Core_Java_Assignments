package com.capgemini.savingaccountclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
/**
 * class Bank Account List which will maintain SavingAccount objects 
 * @author tkhandag
 *
 */
public class BankAccount
{
	/**
	 *Method to  write list Into File
	 * @param list
	 * @param path
	 * @throws IOException
	 */
	public boolean writeIntoFile(ArrayList<SavingAccount> list , String path) throws IOException 
	{
		TreeSet<SavingAccount> accountSet = new TreeSet<SavingAccount>(list);  //Conversion of arraylist into Treeset
		FileOutputStream fout = new FileOutputStream(path);
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(accountSet);
		out.close();
		fout.close();
		return true;
	}
	
	/**
	 *Method to  read from  File with retuurn type Treeset 
	 * @param path
	 * @return
	 * @throws Exception
	 */
	public TreeSet<SavingAccount> readFromFile(String path) throws Exception
	{	
		TreeSet<SavingAccount> readResult = null;		//Initializing Treeset object to store the result from file
		 if((new File(path).exists()))
		 {
			 FileInputStream fis = new FileInputStream(path);
			 ObjectInputStream in = new ObjectInputStream(fis); 
			 readResult = (TreeSet<SavingAccount>)in.readObject();  
			 in.close();
			 fis.close();
		 }
		 else if(!(new File(path).exists()))
		 { throw new FileNotFoundException();}
		 else {
			 throw new Exception();
		 }
		return readResult;
	 
	}

}
