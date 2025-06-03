package B1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer {
	
	    private String customerId;
	    private String name;
	    private List<Account> accounts;

	    public Customer(String name) {
	        this.customerId = UUID.randomUUID().toString();
	        this.name = name;
	        this.accounts = new ArrayList<>();
	    }

	    public void openAccount(Account account) {
	        accounts.add(account);
	    }

	    public List<Account> getAccounts() {
	        return accounts;
	    }

	    public String getCustomerId() {
	        return customerId;
	    }

	    public String getName() {
	        return name;
	    }
	}



