package com.moneymoneybank.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.moneymoneybank.BankAccount;
import com.moneymoneybank.SavingAccount;

public class TestforMoneyMoneyBank {

	@Test
	public void test() 
	{
		 SavingAccount account = new SavingAccount(111,"Tejas",12000 ,true);
		 account.withdraw(500);
	}

}
