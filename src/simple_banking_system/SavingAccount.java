package simple_banking_system;

public class SavingAccount extends BankAccount{
    // Override methods and add interest logic
	
	public double interestRate = 0.08;
	@Override
	public void deposit(double amount) {
		balance += amount;
	}
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	@Override
	public double calculateInterest() {
		return balance *= interestRate;
	}
}
