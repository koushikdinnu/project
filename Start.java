package com.capg.project.presentation;

import java.util.Scanner;

import com.capg.project.bean.Account;
import com.capg.project.service.ServiceImpl;
import com.capg.project.service.ServiceInterface;


public class Start {
	static ServiceInterface service=new ServiceImpl();
	public void displayUnit() 
	{
		System.out.println("******WELCOME******");
		System.out.println("enter yout choice");
		System.out.println("1. create account");
		System.out.println("2. add money into wallet ");
		System.out.println("3. Transfer money to another account");
		System.out.println("4. show all details");
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
while(true)
{
	System.out.println("enter your choice");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		try {
			Account account=new Account();
			System.out.println("To create new account fill the following details");
			System.out.println("enter your name");
			account.setCustName(sc.next());
			System.out.println("enter your mobile number");
			account.setCustNumber(sc.nextLong());
			System.out.println("enter your email id");
			account.setCustMailId(sc.next());
			String AccountNumber=service.createAccount(account);
			System.out.println("the generated account number is" +AccountNumber);
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	case 2:
		try {
			System.out.println("add money into the wallet");
			System.out.println("enter your account number");
			String AccountNumber= sc.next();
			System.out.println("enter the money to be added");
			int Money=sc.nextInt();
			service.addMoney(AccountNumber, Money);
			System.out.println("Your money added to the wallet successfully");
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	case 3:
		try {
			System.out.println("fill the required details");
			System.out.println("enter the sender account");
			String AccountNumber1=sc.next();
			System.out.println("enter the reciever account");
			String AccountNumber2=sc.next();
			System.out.println("enter the transfer amount");
			int amount=sc.nextInt();
			service.transferAccount(AccountNumber1, AccountNumber2, amount );
			System.out.println("transaction done successfully");
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	case 4:
		try {
			System.out.println("Showing all details for the given account number");
			System.out.println("enter the account number");
			String AccountNumber=sc.next();
			service.showDetails(AccountNumber);
			}
		catch (Exception e)
		{
			System.out.println(e);
		}
	case 5: 
		System.exit(0);
		default:
			System.out.println("choose in between 1-5 only");
		 }
	       }
        	}
			 }
