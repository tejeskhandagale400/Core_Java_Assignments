package com.capgemini.savingaccounttests;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Test;

import com.capgemini.savingaccountclasses.BankAccount;
import com.capgemini.savingaccountclasses.SavingAccount;
 
/**
 * Test For Saving Account
 * @author tkhandag
 *
 */
public class TestForSavingAccount {

	/**
	 * Test For Writing Into File Saving Account
	 */
	@Test
	public void testForWritingIntoFileSavingAccount()
	{
		ArrayList<SavingAccount> accountList = new ArrayList<SavingAccount>();
		accountList.add(new SavingAccount(10000,"Tejas",true));
		accountList.add(new SavingAccount(15000,"Shubham",true));
		accountList.add(new SavingAccount(99000,"Tushar",true));
		accountList.add(new SavingAccount(50000,"Shubham",true));
		accountList.add(new SavingAccount(9020,"Rohan",true));
		
		Iterator<SavingAccount> iterate = accountList.iterator();
		while(iterate.hasNext())
		{
			System.out.println(iterate.next());
		}
		
		BankAccount accountWrite = new BankAccount();
		try 
		{
			boolean actual = accountWrite.writeIntoFile(accountList , "C:/work/Java/Saving Account.txt");
			assertTrue(actual);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
 	}
	
	/**
	 * Test For Reading File Of Saving Account
	 */
	@Test
	public void testForReadingFileOfSavingAccount()
	{
		TreeSet<SavingAccount> accountListRead = new TreeSet<SavingAccount>();		
		BankAccount accountRead = new BankAccount();
		 	try {
		 		accountListRead  = accountRead.readFromFile("C:/work/Java/Saving Account.txt");
		 		String expected = "[SavingAccount [accountBalance=10000.0, accountHolderName=Tejas, isSalary=true, acountId=101], SavingAccount [accountBalance=15000.0, accountHolderName=Shubham, isSalary=true, acountId=102], SavingAccount [accountBalance=99000.0, accountHolderName=Tushar, isSalary=true, acountId=103], SavingAccount [accountBalance=50000.0, accountHolderName=Shubham, isSalary=true, acountId=104], SavingAccount [accountBalance=9020.0, accountHolderName=Rohan, isSalary=true, acountId=105]]";
				assertEquals(expected,accountListRead.toString());
		 		Iterator<SavingAccount> iterate = accountListRead.iterator();
				while(iterate.hasNext())
				{
					System.out.println(iterate.next());
				}
				} catch (Exception e) 
			 	{
					e.printStackTrace();
				}
		 
 	}
}
