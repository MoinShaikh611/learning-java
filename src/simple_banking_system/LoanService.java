package simple_banking_system;

public interface LoanService {
	double calculateLoanEMI(double principal, double rate, int tenureMonths);
}
