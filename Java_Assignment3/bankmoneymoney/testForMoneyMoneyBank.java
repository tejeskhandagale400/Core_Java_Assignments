package bankmoneymoney;

import static org.junit.Assert.*;

import org.junit.Test;

public class testForMoneyMoneyBank {

	@Test
	public void testforDepositeSuccessful()
	{	
		SavingAccount newAccountOne = new SavingAccount("Tejas" ,100);
		newAccountOne.deposite(500);
		assertEquals(600,newAccountOne.getAccountaBalance(),0);
		 
	}
	

	@Test
	public void testforWithdrawSuccessful()
	{	
		SavingAccount newAccountOne = new SavingAccount("Tejas" ,5000);
		newAccountOne.withdraw(1000);
		assertEquals(4000,newAccountOne.getAccountaBalance(),0);
		 
	}
	
	@Test
	public void testforWithdrawFailed()
	{	
		SavingAccount newAccountOne = new SavingAccount("Tejas" ,5000);
		newAccountOne.withdraw(6000);
		assertEquals(5000,newAccountOne.getAccountaBalance(),0);
		 
	}
	

	@Test
	public void testforPaymentGatewaySuccessfull()
	{	
		SavingAccount newAccountOne = new SavingAccount("Tejas" ,5000);
		SavingAccount newAccountTwo = new SavingAccount("Tejas" ,5000);
		
		assertTrue(PaymentGateway.transfer(newAccountOne, newAccountTwo, 2000));
		 
	}
	
	@Test
	public void testforPaymentGatewayFailed()
	{	
		SavingAccount newAccountOne = new SavingAccount("Tejas" ,5000);
		SavingAccount newAccountTwo = new SavingAccount("Tejas" ,5000);	
		assertFalse(PaymentGateway.transfer(newAccountOne, newAccountTwo, 6000));
		 
	}

}
