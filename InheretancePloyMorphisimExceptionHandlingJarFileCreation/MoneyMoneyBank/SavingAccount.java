package com.moneymoneybank;

public class SavingAccount extends BankAccount {
	
	private boolean isSalary;
	private static final float MINIMUMBALANCE = 5000 ;
	
	public SavingAccount(int accountNumber, String accountHolderName, float accountBalance, boolean isSalary) 
	{
		 super(accountNumber, accountHolderName, accountBalance);
		 this.isSalary = isSalary;
	}

	@Override
	public void withdraw(float amount) 
	{
		 if( amount>0 && amount <= super.getAccountBalance())
		 {
			 super.deposite(-amount);
		 }

	}

	 

}
