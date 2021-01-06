// Driver

public class Transaction{
	public static void main (String args[]){
		// create the object of the account class

		Account acc1 = new Account (456.4, "Johnson", 92131);
		Account acc2 = new Account (10.0, "Tony", 31287);
		Account acc3 = new Account (876.21, "Simpson", 8976);

		acc1.deposit(45.9);
		System.out.println(acc2.deposit(65.34));
		acc1.withdraw(7.8, 1.5);
		acc1.addInterest();
		acc2.addInterest();
		acc3.addInterest();
		System.out.println();
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);

	}
}