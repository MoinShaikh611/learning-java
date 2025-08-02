package simple_banking_system;

import java.util.List;

public class Customer {
	private String name;
	private String customerId;
	private List<BankAccount> accounts;
	
	
	public Customer(String name, String customerId, List<BankAccount> accounts) {
		super();
		this.name = name;
		this.customerId = customerId;
		this.accounts = accounts;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public List<BankAccount> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", customerId=" + customerId + ", accounts=" + accounts + "]";
	}

	
}
