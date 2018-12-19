package com.moneymoneybank;

public abstract class BankAccount 
{
	private int accountNumber; 
	private String accountHolderName;
	private float accountBalance;
	
	public BankAccount(int accountNumber, String accountHolderName, float accountBalance)
	{
		this.accountNumber = accountNumber; 
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	abstract public void withdraw(float amount);
	
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
	
	public void deposite(float amount) 
	{
		accountBalance +=amount;
	}
	
	@Override
	public String toString() 
	{
		return "BankAccount [accountNumber=" + accountNumber
				+ ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	} 
	 
}