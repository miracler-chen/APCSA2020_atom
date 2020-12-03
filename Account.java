// Driven Class

import java.text.NumberFormat;

public class Account
{
	// Always make them private so that no one can access outside the class
	private final double RATE = 0.035; // 3.5% Interests
	private double balance; // current balance in the account
	private String name; // Name of the account holder
	private int accNumber; // account number of the account holder

	// Contractor 
	public Account (double amount, String owner, int num){
		// initialize
		balance = amount;
		name = owner;
		accNumber = num;
	}

	//deposit
	public double deposit(double amount){
		balance += amount;
		return balance;
	}

	// withdraw from the account
	public double withdraw(double amount, double fee){
		balance -= (amount + fee);
		return balance;
	}

	// interest
	public double addInterest(){
		balance *= (1 + RATE);
		return balance;
	}

	public double getBallance(){
		return balance;
	}

	public String toString(){
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return "The account with " + accNumber + " number " + name + " has balance of " + fmt.format(balance);
	}
}