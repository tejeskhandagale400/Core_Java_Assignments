package com.moneymoneybank.framework;

import com.moneymoneybank.exceptions.InsuffientAmountException;
import com.moneymoneybank.exceptions.InvalidAmountEnteredException;

public abstract class BankAccount 
{
	private int accountNumber ; 
	private String accountHolderName;
	private float accountBalance;
	private static int accountNumberIncrementor;
	
	static 
	{
		accountNumberIncrementor = 100;
	}
	/*{
		accountNumberIncrementor++;
	}*/
	
	public BankAccount( String accountHolderName, float accountBalance)
	{
		this.accountNumber = accountNumberIncrementor; 
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		accountNumberIncrementor++;
	}
	
	abstract public void withdraw(float amount) throws InsuffientAmountException;
	
	public String getAccountHolderName() 
	{
		return accountHolderName;
	}
	
	public void setAccountHolderName(String accountHolderName) 
	{
		this.accountHolderName = accountHolderName;
	}
	
	public int getAccountNumber() 
	{
		return accountNumber;
	}
	
	public float getAccountBalance() 
	{
		return accountBalance;
	}
	
	public void setAccountBalance(float amount) 
	{
		this.accountBalance -= accountBalance;
	}
	
	public void deposite(float amount) throws InvalidAmountEnteredException 
	{
		if(amount > 0)
			accountBalance +=amount;
		else throw new InvalidAmountEnteredException("Invalid Entered Amount");
	}
	
	@Override
	public String toString() 
	{
		return "BankAccount [accountNumber=" + accountNumber
				+ ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	} 
	 
}