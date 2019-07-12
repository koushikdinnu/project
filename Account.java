package com.capg.project.bean;

public class Account {
	private String CustName;
	private long CustNumber;
	private String CustMailId;
	private int Balance;
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public long getCustNumber() {
		return CustNumber;
	}
	public void setCustNumber(long custNumber) {
		CustNumber = custNumber;
	}
	public String getCustMailId() {
		return CustMailId;
	}
	public void setCustMailId(String custMailId) {
		CustMailId = custMailId;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		this.Balance = balance;
	}
	@Override
	public String toString() {
		return "Account [CustName=" + CustName + ", CustNumber=" + CustNumber + ", CustMailId=" + CustMailId
				+ ", balance=" + Balance + "]";
	}
	public void setBalance1(int temp1) {
		// TODO Auto-generated method stub
		
	}
	public int getBalance1() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
