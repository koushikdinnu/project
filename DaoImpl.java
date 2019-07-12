package com.capg.project.dao;

import java.util.HashMap;
import java.util.Map;

import com.capg.project.bean.Account;

public class DaoImpl implements DaoInterface {
	Map<String, Account> map=new HashMap<String, Account> ();
	public String createAccountdao(String AccountNumber, Account account)
			{
		try {
			map.put(AccountNumber, account);
		}
		catch(Exception e)
		{
			throw e;
		}
		return AccountNumber;
			}
	public void addMoney(String AccountNumber, int money) {
		try {
		Account account=new Account();
		account=map.get(AccountNumber);
		int temp=account.getBalance();
		temp=temp+money;
		account.getBalance();
		}
		catch (Exception e)
		{
			throw e;
		}
	}
		
		public void transferAccount(String accountNumber1, String accountNumber2, int amount)
		{
			try {
				if(!accountNumber1.equals(accountNumber2))
				{
					Account account1=map.get(accountNumber1);
					Account account2=map.get(accountNumber2);
					int temp1=account1.getBalance1();
					int temp2=account2.getBalance1();
					temp1=temp1-amount;
					temp2=temp2+amount;
					account1.setBalance1(temp1);
					account2.setBalance1(temp2);
				}
				else {
					System.out.println("exception");
				}
			}
			catch(Exception e)
			{
				throw e;
			}
		}
		public void viewAccount(String AccountNumber) {
			try {
				Account account=new Account();
				account=map.get(AccountNumber);
			}
			catch(Exception e)
			{
				throw e;
				
				
			}
			
		}
}
