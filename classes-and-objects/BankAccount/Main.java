class Main {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.setAccountDetails("John", 141414);
		account.deposit(100);
		account.displayInfo();

		account.withdraw(20);
		account.displayInfo();
	}
}