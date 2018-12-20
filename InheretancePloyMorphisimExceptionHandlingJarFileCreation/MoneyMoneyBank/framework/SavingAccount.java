package com.moneymoneybank.framework;

import com.moneymoneybank.exceptions.InsuffientAmountException;
import com.moneymoneybank.exceptions.InvalidAmountEnteredException;

public abstract class SavingAccount extends BankAccount {
	
	private boolean isSalary;
	

	private static final float MINIMUMBALANCE = 1000 ;
	
	public SavingAccount( String accountHolderName, float accountBalance, boolean isSalary) 
	{
		 super(accountHolderName, accountBalance);
		 this.isSalary = isSalary;
	}

	
	@Override
	abstract public void withdraw(float amount) throws InsuffientAmountException;
	
	
	public static float getMinimumbalance() 
	{
		return MINIMUMBALANCE;
	}
	 

}


