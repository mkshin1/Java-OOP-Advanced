package com.codingdojo.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount Michael = new BankAccount();
		
		Michael.depositChecking(100);
		Michael.depositSaving(50);
		Michael.viewBalance();
		
		Michael.withdrawChecking(10);
		Michael.withdrawSaving(5);
		Michael.viewBalance();
		double totalBalance = Michael.getChecking() + Michael.getSaving();
		System.out.println("Michael's $" + totalBalance + " deposit");
		System.out.println("Michael's $" + Michael.total() + " deposit");
		
		
}