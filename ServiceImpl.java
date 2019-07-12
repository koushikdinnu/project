package com.capg.project.service;

import java.util.Random;

import com.capg.project.bean.Account;
import com.capg.project.dao.DaoImpl;
import com.capg.project.dao.DaoInterface;


public  class ServiceImpl implements ServiceInterface{
	DaoInterface dao=new DaoImpl();

		public String createAccount(Account account) {
			try{
		 Random rand=new Random();
		 int num=rand.nextInt(1000)+100000;
		 String AccountNumber= String.valueOf(num);
		 dao.createAccountdao(AccountNumber, account);
		}
	    catch(Exception e)
	{
		throw e;
	}
	return account;
		}
		
		
		public void viewAccount(String AccountNumber) {
		 try{
			dao.viewAccount(AccountNumber);
		}
		 catch (Exception e) 
		 {
			 throw e;
		 }		
		}
		
		
		public void addMoney(String accountNumber, int money) {
			try {
				dao.addMoney(accountNumber, money);
				}
			catch(Exception e) {
				throw e;
			}
		}
		
		
		public void transferAccount(String accountNumber1, String accountNumber2, int amount) {
			try {
				dao.transferAccount(accountNumber1, accountNumber2, amount);
			}
			catch (Exception e)
			{
				throw e;
			}
		}	
		public void showDetails(String accountNumber) {
			try {
			dao.viewAccount(accountNumber);			
			}			
			catch(Exception e)
			{
				throw e;
			}
			}		
			}
