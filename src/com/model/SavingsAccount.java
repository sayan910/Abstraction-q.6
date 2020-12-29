package com.model;

public class SavingsAccount extends Account {
	private double minimumBalance;

	public SavingsAccount(int accNumber, String holderName, double balance, double minimumBalance) {
		super(accNumber, holderName, balance);
		// TODO Auto-generated constructor stub
		this.minimumBalance=minimumBalance;
	}
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance=minimumBalance;
	}
	@Override
	public double calculateInterest() {
		double interest=(double)((super.balance *5)/100);
		return interest;
	}
	

}
