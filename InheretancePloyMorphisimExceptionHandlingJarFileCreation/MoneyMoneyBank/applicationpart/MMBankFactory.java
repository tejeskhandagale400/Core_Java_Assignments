package com.moneymoneybank.applicationpart;

import com.moneymoneybank.framework.BankFactory;
import com.moneymoneybank.framework.CurrentAccount;
import com.moneymoneybank.framework.SavingAccount;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAccount getNewSavingAccount(String accountHolderName, float accountBalance, boolean isSalary) 
	{
		return new MMSavingAccount(accountHolderName,  accountBalance,  isSalary);
	}

	@Override
	public CurrentAccount getNewCurrentAccount(String accountHolderName, float accountBalance, float creditLimit) 
	{

		return new MMCurrentAccount(accountHolderName,  accountBalance, creditLimit);
	}

}
