package com.moneymoneybank.framework;

import com.moneymoneybank.exceptions.InsuffientAmountException;
import com.moneymoneybank.exceptions.InvalidAmountEnteredException;

public abstract class CurrentAccount extends BankAccount {

	private float creditLimit;		//Read Only
	

	public CurrentAccount(String accountHolderName,float accountBalance , float creditLimit) 
	{
		super(accountHolderName, accountBalance);
		this.creditLimit = creditLimit;
		 
	}

		public float getCreditLimit() {
		return creditLimit;
	}

		@Override
	abstract public void withdraw(float amount) throws InsuffientAmountException; 
	

		@Override
		public String toString() {
			return "CurrentAccount [creditLimit=" + creditLimit
					+ ", getAccountHolderName()=" + getAccountHolderName()
					+ ", getAccountNumber()=" + getAccountNumber()
					+ ", getAccountBalance()=" + getAccountBalance() + "]";
		}

}
