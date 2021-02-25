package com.codingdojo.bankaccount;

import java.util.Random;

public class BankAccount {
	//(string) account number, (double) checking balance, (double) savings balance.
	protected String account;
	private double savings;
	private double checkings;
	private static int totalDeposits = 0;
	private static int numberOfAccounts = 0;
	
	public BankAccount() {
		setAccount();
		setSaving();
		setChecking();
		numberOfAccounts = numberOfAccounts + 1;
	}
	public void setAccount() {
		this.account = generateAccount();
	}
	public void setChecking() {
		this.checkings = 0;
	}
	public void setSaving() {
		this.savings = 0;
	}
	public String getAccount() {
		return this.account;
	}
	public double getChecking() {
		return this.checkings;
	}
	
	public double getSaving() {
		return this.savings;
	}
		
	public void depositChecking(double deposit) {
		this.checkings += deposit;
		totalDeposits += this.checkings;
	}
	
	public void depositSaving(double deposit) {
		this.savings += deposit;
		totalDeposits += this.savings;
	}
	

	
	public double withdrawChecking(double amount) {
		if (amount > this.checkings) {
			throw new IllegalArgumentException("insufficient balance");		
		} else {
			this.checkings -= amount;
			totalDeposit -= amount;
		}
		return this.checkings;
	}
	
	public double withdrawSaving(double amount) {
		if (amount > this.savings) {
			throw new IllegalArgumentException("insufficient balance");		
		} else {
			this.savingBalance -= amount;
			totalDeposit -= amount;
		}
		return this.savings;
	}
	
	private String generateAccount() {
		String accountNumber = "";
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			accountNum += String.valueOf(rand.nextInt(10));
		}
		return accountNum;
	}
	public double total() {
		return this.checkingBalance + this.savingBalance;
	}
	
	public void viewBalance() {
		System.out.println("Checking balance: $" + this.checkingBalance + " Saving balance: $" + this.savingBalance);
	}
	
	public static int getAccounts() {
		return numberOfAccounts;
	}
	
	public static double getTotalDeposits() {
		return totalDeposits;
	}
	
}