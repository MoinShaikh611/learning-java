package simple_banking_system;

public class CurrentAccount extends BankAccount{
    // No interest, minimum balance penalty logic
	double minimumBalance = 2000;
	public double interestRate = 0.02;

	public double minimumBalancePenalty() {
		if(balance < minimumBalance) {
			balance -= 200;
		}
		return balance;
	}
	
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
		balance = balance * interestRate;
		return balance;
	}
	
}
