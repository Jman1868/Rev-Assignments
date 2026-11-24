package com.banking;

import com.banking.utility.InputUtility;
import com.banking.operations.BankingOperations;
import com.banking.model.Customer;
import com.banking.utility.InputUtility;
import com.banking.exception.InvalidAccountException;
import com.banking.model.Account;
import com.banking.model.SavingsAccount;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        boolean running = true;
        BankingOperations bankingOperations = new BankingOperations();

        while (running) {

            System.out.println("\n===== BANKING MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Customer");
            System.out.println("2. Create Account");
            System.out.println("3. View Customer Details");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Check Balance");
            System.out.println("7. Transfer Money");
            System.out.println("8. Transaction History");
            System.out.println("9. Exit");

            int choice = InputUtility.getInt("Enter your choice: ");

            switch (choice) {

                case 1:
                    String name = InputUtility.getString("Enter customer name: ");
                    String email = InputUtility.getString("Enter email: ");
                    String phone = InputUtility.getString("Enter phone: ");

                    Customer customer = new Customer(name, email, phone);

                    bankingOperations.createCustomer(customer);


                    break;

                case 2:

                    Account account = new SavingsAccount( 1000000001L, 1, 500.00, LocalDate.now() );
                    bankingOperations.createAccount(account);
                    break;

                case 6:
                    long accountNumber = InputUtility.getLong("Enter account number: ");

                    double balance = 0;
                    try {
                        balance = bankingOperations.checkBalance(accountNumber);
                    } catch (InvalidAccountException e) {
                        e.printStackTrace();
                        System.out.println("Account balance: $" + balance);
                    }

                    break;

                case 9:
                    running = false;
                    System.out.println("Thank you for using our banking system.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}