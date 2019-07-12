package com.capg.project.dao;

import com.capg.project.bean.Account;

public interface DaoInterface {
	public String createAccountdao(String accountNumber, Account account);
	public void addMoney(String accountNumber, int money);
	public void transferAccount(String accountNumber1, String accountNumber2, int amount);	
	public void viewAccount(String accountNumber);
	

}
