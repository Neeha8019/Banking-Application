package B1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Scanner;



public class main {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create Bank and Customer
	        Bank bank = new Bank();
	        System.out.println("Enter customer name:");
	        String customerName = scanner.nextLine();
	        bank.createCustomer(customerName);

	        // Retrieve the customer
	        Customer customer = bank.findCustomerById(bank.getCustomers().get(0).getCustomerId());
	        
	        // Open an account for the customer
	        Account customerAccount = new Account();
	        customer.openAccount(customerAccount);

	        // Display current actions for the user
	        System.out.println("Account created for customer: " + customer.getName() + " with account number: " + customerAccount.getAccountNumber());

	        // Deposit operation
	        System.out.println("Enter amount to deposit:");
	        double depositAmount = scanner.nextDouble();
	        bank.performTransaction(customerAccount, depositAmount, "deposit");

	        // Withdrawal operation
	        System.out.println("Enter amount to withdraw:");
	        double withdrawalAmount = scanner.nextDouble();
	        bank.performTransaction(customerAccount, withdrawalAmount, "withdrawal");

	        // Final balance
	        System.out.println("Final Balance for " + customer.getName() + ": " + customerAccount.getBalance());
	    }
	}

	
