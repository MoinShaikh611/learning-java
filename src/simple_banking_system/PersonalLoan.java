package simple_banking_system;

public class PersonalLoan implements LoanService{
	
	public double calculateLoanEMI(double principal, double rate, int tenureMonths) {
		rate = rate / (12*100); // converting to monthly interest
		
		return (principal * rate * Math.pow(1+rate,tenureMonths))/(Math.pow(1 + rate, tenureMonths) - 1);
		
	}
}
