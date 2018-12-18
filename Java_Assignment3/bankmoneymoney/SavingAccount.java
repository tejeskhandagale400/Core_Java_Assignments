package bankmoneymoney;

public class SavingAccount {
	
	private String accountHolderName ;					//instance member variables are declared here 
	private double accountaBalance;
	private int accountNumber;
	private static int nextAccountNumber=1;
	
	public static int getNextAccountNumber() 			//here the next account number can be acces by calling by calss
	{
		return nextAccountNumber;
	}

	  

	public SavingAccount(String name) 						//argument constructor with one argument getting name
	{
		 this.accountHolderName = name;
		 this.accountNumber = nextAccountNumber;
		 nextAccountNumber++;
	}

	public SavingAccount(String name, double accountBalance)		//argument constructor with two argument getting name and initial balance
	{
		 this.accountHolderName = name;
		 this.accountaBalance = accountBalance;
		 this.accountNumber = nextAccountNumber;
		 nextAccountNumber++;

	}

	public void deposite(double amount)				//here amount can be deposite into account
	{
		accountaBalance += amount;
		
	}

	@Override
	public String toString() 
	{
		return "SavingAccount [accountHolderName=" + accountHolderName
				+ ", accountaBalance=" + accountaBalance + ", accountNumber="
				+ accountNumber + "]";
	}

	public void withdraw(double amount) 		//here amount can be withdraw from account
	{
		if(accountaBalance> amount)
		accountaBalance -= amount;
		
	}

	public String getAccountHolderName()				//to get account holder name
	{
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) 		//to set Account holder name
	{
		this.accountHolderName = accountHolderName;
	}

	public double getAccountaBalance() 								//to get account balance
	{
		return accountaBalance;
	}

	  

	public   int getAccountNumber()								//to get account number
	{
		return accountNumber;
	}

 

}
