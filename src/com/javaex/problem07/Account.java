package com.javaex.problem07;

public class Account {

    private String accountNo;
    private int balance;
	
    
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public void deposit(int x) {
		balance= balance+x;
	}
	public void withdraw(int x) {
		balance= balance-x;
	}
	public void showBalance() {
		System.out.println(balance);
	}
   

}
