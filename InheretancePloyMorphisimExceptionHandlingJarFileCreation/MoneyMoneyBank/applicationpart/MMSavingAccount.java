package com.moneymoneybank.applicationpart;

import com.moneymoneybank.exceptions.InsuffientAmountException;
import com.moneymoneybank.exceptions.InvalidAmountEnteredException;
import com.moneymoneybank.framework.SavingAccount;

public class MMSavingAccount extends SavingAccount {
	
/*	private static final float MINIMUMBALANCE = 100 ;
*/
	public MMSavingAccount(String accountHolderName,float accountBalance, boolean isSalary) 
	{
		super(accountHolderName, accountBalance, isSalary);
	 
	}

	@Override
	public String toString() 
	{
		return "MMSavingAccount [toString()=" + super.toString() + "]";
	}

	@Override
	public void withdraw(float amount) throws InsuffientAmountException
	{
		 
		 if( amount >= super.getMinimumbalance() && amount <= super.getAccountBalance())
		 {
			
			  super.setAccountBalance(amount);
		 }
		 
		 else throw new InsuffientAmountException("Insuffient Amount");
	

	}

}
