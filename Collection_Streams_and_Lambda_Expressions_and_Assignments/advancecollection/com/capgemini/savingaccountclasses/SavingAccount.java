package com.capgemini.savingaccountclasses;

import java.io.Serializable;

/**
 * 	Class SavingAccount with field’s acc_balance, acc_ID, accountHoldername, isSalaryAccount to create new account
 * @author tkhandag
 *
 */
public class SavingAccount implements Serializable ,Comparable<SavingAccount>
{
	private double accountBalance;
	private String accountHolderName;
	private boolean isSalary;
	private int acountId;
	private static int acountIdIncrementor;

	
	/**
	 * Initializing Static incrementor fot id 
	 */
	static
	{
		acountIdIncrementor=100;
	}
	
	 
	{
		acountIdIncrementor++;
	}
	/**
	 * Constructor for saving account with below parameters
	 * @param accountBalance
	 * @param accountHolderName
	 * @param isSalary
	 */
	public SavingAccount(double accountBalance, String accountHolderName, boolean isSalary)
	{
		this.accountBalance =  accountBalance;
		this.accountHolderName =  accountHolderName;
		this.isSalary = isSalary;
		acountId =acountIdIncrementor; 
	}
	/**
	 * Haschcode to set the object and sort on the basis of accountId 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + acountId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccount other = (SavingAccount) obj;
		if (acountId != other.acountId)
			return false;
		return true;
	}

	/**
	 * It returns  Account Holder Name
	 * @return
	 */
	public String getAccountHolderName()
	{
		return accountHolderName;
	}
	
	/**
	 * To change Account Holder Name
	 * @param accountHolderName
	 */
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	
	/**
	 * To get info about isSalary
	 * @return
	 */
	public boolean isSalary() 
	{
		return isSalary;
	}
		
	/**
	 * To get the information about account balance
	 * @return
	 */
	public double getAccountBalance() 
	{
		return accountBalance;
	}
	
	/**
	 * To get information about account id
	 * @return
	 */
	public int getAcountId() 
	{
		return acountId;
	}
	
	/**
	 * To deposite amount by passing amount
	 * @param amount
	 */
	public void deposite(double amount) 
	{
		if(amount >0)
		accountBalance += amount;
	}

	@Override
	public String toString() {
		return "SavingAccount [accountBalance=" + accountBalance
				+ ", accountHolderName=" + accountHolderName + ", isSalary="
				+ isSalary + ", acountId=" + acountId + "]";
	}

	/**
	 * Withdraw Method 
	 * @param amount
	 */
	public void withdraw(double amount)
	{
		if(amount <= accountBalance)
		accountBalance -= amount;
		
	}

	/**
	 * It is used to avoid duplicates as well as data should be displayed in sorted order. (as per acc_ID)  
	 */
	@Override
	public int compareTo(SavingAccount accountPassed) 
	{
		if(this.acountId < accountPassed.acountId)
			return -1;
		else if(this.acountId == accountPassed.acountId)
			return 0;
		else
		return  1;
	}

	 

}
