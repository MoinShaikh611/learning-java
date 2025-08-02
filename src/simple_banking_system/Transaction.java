package simple_banking_system;

import java.util.Date;

public class Transaction {
	private String transactionId;
	private String type;
	private double amount;
	private Date date;

	public Transaction(String transactionId, String type, double amount) {
		this.transactionId = transactionId;
		this.type = type;
		this.amount = amount;
		this.date = new Date();
	}
	

	@Override
	public String toString() {
        return date + " | " + type + ": ₹" + amount + " | ID: " + transactionId;	}
	
	
}
