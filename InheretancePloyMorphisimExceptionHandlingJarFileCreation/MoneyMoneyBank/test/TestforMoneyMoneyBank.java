package com.moneymoneybank.test;

import static org.junit.Assert.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.moneymoneybank.applicationpart.MMBankFactory;
import com.moneymoneybank.exceptions.InsuffientAmountException;
import com.moneymoneybank.exceptions.InvalidAmountEnteredException;
import com.moneymoneybank.framework.BankFactory;
import com.moneymoneybank.framework.CurrentAccount;
import com.moneymoneybank.framework.SavingAccount;

public class TestforMoneyMoneyBank {

	 BankFactory account = new MMBankFactory(); 
		private Logger logger = Logger.getLogger(TestforMoneyMoneyBank.class.getName());
	 
	 SavingAccount savingAccount ;
	 CurrentAccount currentAccount ;
	@Before
	public void setUp(){
		savingAccount =  account.getNewSavingAccount("Tejas",100 ,true);
		currentAccount = account.getNewCurrentAccount("Shubham",500 ,100);
		BasicConfigurator.configure();
		
	}
	
	
	
	@Test()
	public void testToCheckGetAccountNumberOfSavingAccount() 
	{
		assertEquals(100,savingAccount.getAccountNumber());
		 
	}
	
	@Test()
	public void testToCheckGetAccountHolderNameOfSavingAccount() 
	{
		assertEquals("Tejas",savingAccount.getAccountHolderName());
		 
	}
	 
	@Test()
	public void testToCheckGetAccountBalanceNameOfSavingAccount() 
	{
		assertEquals(100,savingAccount.getAccountBalance(),0);
		 
	}
	
	@Test()
	public void testToCheckGetAccountBalanceNameOfCurrentAccount() 
	{
		assertEquals(500,currentAccount.getAccountBalance(),0);
		 
	}
	
	@Test()
	public void testToChecDepositeOfSavingAccountWithValidAmount() 
	{
		try 
		{
			savingAccount.deposite(500);
			assertEquals(600,savingAccount.getAccountBalance(),0);

		} 
		catch (InvalidAmountEnteredException e)
		{
			logger.error(e);
		}
		catch (Exception e)
		{
			logger.error(e);
		}
		 
	}
	
	@Test()
	public void testToChecDepositeOfCurrentAccountWithValidAmount() 
	{
		try 
		{
			currentAccount.deposite(500);
		} 
		catch (InvalidAmountEnteredException e)
		{
			logger.error(e);
		}
		catch (Exception e)
		{
			logger.error(e);
		}
		assertEquals(1000,currentAccount.getAccountBalance(),0);
		 
	}
	
	
	@Test()
	public void testToChecDepositeOfSavingAccountWithInValidAmount() 
	{
		try 
		{
			savingAccount.deposite(0);
			assertEquals(600,currentAccount.getAccountBalance(),0);

		} 
		catch (InvalidAmountEnteredException e)
		{
			logger.error(e);
		}
		catch (Exception e)
		{
			logger.error(e);
		}
		 
	}
	

	@Test()
	public void testToChecDepositeOfCurrentAccountWithInValidAmount() 
	{
		try 
		{
			currentAccount.deposite(0);
			System.out.println(currentAccount.getAccountBalance());
			assertEquals(500,currentAccount.getAccountBalance(),0);
		} 
		catch (InvalidAmountEnteredException e)
		{
			logger.error(e);
		}
		catch (Exception e)
		{
			logger.error(e);
		}
		
		 
	}
	
	@Test()
	public void testToCheckSavingAccountWithDrawWithValidAmmount() 
	{
		try 
		{
			savingAccount.withdraw(100);
		} 
		catch (InsuffientAmountException e)
		{		
			logger.error(e);
		}
		catch (Exception e)
		{		
			logger.error(e);
		}
		 
	}
	
	@Test()
	public void testToCheckSavingAccountWithDrawWithInValidAmmount() 
	{
		try 
		{
			savingAccount.withdraw(0);
		} 
		catch (InsuffientAmountException e)
		{		
			logger.error(e);
		}
		catch (Exception e)
		{		
			logger.error(e);
		}
		 
	}
	
	@Test
	public void testToCheckCurrentAccountWithDrawWithValidAmmount() 
	{
 		try 
 		{
			currentAccount.withdraw(100);
		 
		} 
 		catch (InsuffientAmountException e) 
 		{
			e.printStackTrace();
		}
 		catch ( Exception e) 
 		{		
			e.printStackTrace();
		}
		 
	}
	
	@Test
	public void testToCheckCurrentAccountWithDrawWithInValidAmmount() 
	{
 		try 
 		{
			currentAccount.withdraw(50);
		 
		} 
 		catch (InsuffientAmountException e) 
 		{
			e.printStackTrace();
		}
 		catch ( Exception e) 
 		{		
			e.printStackTrace();
		}
		  
	}
	
	
	
}
