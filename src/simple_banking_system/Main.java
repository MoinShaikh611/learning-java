package simple_banking_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		BankAccount acc1 = new SavingAccount();
		acc1.setAccountNumber("sav123");
		acc1.deposit(1000);
		
		CurrentAccount acc2 = new CurrentAccount();
		acc2.setAccountNumber("cur456");
		acc2.deposit(10000);
		acc2.minimumBalancePenalty();
		
	
		List<BankAccount> accounts = new ArrayList<>();
		accounts.add(acc1);
		accounts.add(acc2);
		
		Customer c1 = new Customer("Moin","C001",accounts);
		System.out.println(c1);
		
        System.out.println("Interest on SavingAccount: " + acc1.calculateInterest());
        System.out.println("Interest on CurrentAccount: " + acc2.calculateInterest());

        
        LoanService loan = new PersonalLoan();
        double emi = loan.calculateLoanEMI(100000, 7.5, 12);
        System.out.println("Monthly EMI: ₹" + emi);

		
		
	}
}
