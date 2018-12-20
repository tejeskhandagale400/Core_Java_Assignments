package com.moneymoneybank.framework;

public abstract class BankFactory 
{

	abstract public SavingAccount getNewSavingAccount(String accountHolderName, float accountBalance, boolean isSalary); 
	
	abstract public CurrentAccount getNewCurrentAccount(String accountHolderName,float accountBalance , float creditLimit); 

}
