public class Account{
	private double balance;
	private String name;
	private long acctNum;

	public Account(double initBal, String owner, long number){
		balance = initBal;
		name = owner;
		number = acctNum;
	}

	public void withdraw(double amount){
		if (amount <= balance){
			balance -= amount;
		}
		else{
			System.out.println("Insufficient Balance.");
		}

		
	}
}