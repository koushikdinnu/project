package com.capg.project.service;

import com.capg.project.bean.Account;

public interface ServiceInterface {

	public String createAccount(Account account);
	public void viewAccount(String AccountNumber);
	public void addMoney(String accountNumber, int money);
	public void transferAccount(String accountNumber1, String accountNumber2, int amount);
	public void showDetails(String accountNumber);

}
