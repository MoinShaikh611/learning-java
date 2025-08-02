package simple_banking_system;

abstract public class BankAccount {
	private String accountNumber;
	protected double balance;
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract double calculateInterest();
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	   @Override
	    public String toString() {
	        return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	    }
}
