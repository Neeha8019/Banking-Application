package B1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Transaction {
	
	    private String transactionId;
	    private double amount;
	    private String type;
	    private LocalDateTime timestamp;

	    public Transaction(double amount, String type) {
	        this.transactionId = UUID.randomUUID().toString();
	        this.amount = amount;
	        this.type = type;
	        this.timestamp = LocalDateTime.now();
	    }

	    public void process(Account account) {
	        if (type.equalsIgnoreCase("deposit")) {
	            account.deposit(amount);
	        } else if (type.equalsIgnoreCase("withdrawal")) {
	            account.withdraw(amount);
	        }
	    }

	    public String getTransactionDetails() {
	        return "Transaction ID: " + transactionId + ", Type: " + type + ", Amount: " + amount + ", Timestamp: " + timestamp;
	    }
	}


