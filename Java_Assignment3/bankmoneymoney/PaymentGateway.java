
//method to transfer the given amount from the src to target account.

package bankmoneymoney;

public class PaymentGateway 
{
	public static boolean transfer(SavingAccount sender, SavingAccount reciever, double amount) 
	{
		if(sender.getAccountaBalance() > amount )
		{
			sender.withdraw(amount);
			reciever.deposite(amount);
			return true;
		}
		
		return false;
	}
}