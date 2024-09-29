class BankAccount {
	private int accountNumber;
	String accountHolderName;
	private double balance = 0;


	void deposit(double amount	) {
		this.balance += amount;
		System.out.println("Successfully deposited the amount");
	}

	void withdraw(double amount) {
		
		if ((this.balance - amount) <= 0) {
			System.out.println("Insufficient Balance");
			return;
		}

		this.balance -= amount;
		System.out.println("Available balance is amount: " + balance);
	}

	void setAccountDetails(String name, int accountNumber) {

		this.accountHolderName = name;
		this.accountNumber = accountNumber;
	}

	void displayInfo() {
		System.out.println("Account Number: " + this.accountNumber + "\nAccount Holder: " + this.accountHolderName + "\nBalance: " + this.balance);
	}
}