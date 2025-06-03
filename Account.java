package B1;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Account {
	    private String accountNumber;
	    private double balance;

	    public Account() {
	        this.accountNumber = UUID.randomUUID().toString();
	        this.balance = 0.0;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient funds");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }
	}




