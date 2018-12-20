package com.moneymoneybank.applicationpart;

import com.moneymoneybank.exceptions.InsuffientAmountException;
import com.moneymoneybank.exceptions.InvalidAmountEnteredException;
import com.moneymoneybank.framework.CurrentAccount;

public class MMCurrentAccount extends CurrentAccount {

	public MMCurrentAccount(String accountHolderName,
			float accountBalance, float creditLimit) {
		super(accountHolderName, accountBalance, creditLimit);
	 
	}

	@Override
	public void withdraw(float amount) throws InsuffientAmountException 
	{
		 if( (amount <= super.getCreditLimit()+super.getAccountBalance() ) )
		 {
			  super.setAccountBalance(amount);
		 }
		 else throw new InsuffientAmountException("Insuffient Amount");
		 

	}

}
