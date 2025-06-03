package B1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Bank {

	    private List<Customer> customers;
	    private List<Account> accounts;
		public Object customer;

	    public Bank() {
	        setCustomers(new ArrayList<>());
	        accounts = new ArrayList<>();
	    }

	    public void createCustomer(String name) {
	        Customer customer = new Customer(name);
	        getCustomers().add(customer);
	    }

	    public Customer findCustomerById(String customerId) {
	        for (Customer c : getCustomers()) {
	            if (c.getCustomerId().equals(customerId)) {
	                return c;
	            }
	        }
	        return null;
	    }

	    public void performTransaction(Account account, double amount, String type) {
	        Transaction transaction = new Transaction(amount, type);
	        transaction.process(account);
	        System.out.println(transaction.getTransactionDetails());
	    }

		public List<Customer> getCustomers() {
			return customers;
		}

		public void setCustomers(List<Customer> customers) {
			this.customers = customers;
		}
	}


