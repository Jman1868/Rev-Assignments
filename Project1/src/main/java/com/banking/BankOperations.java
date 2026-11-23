package com.banking;

import com.banking.model.Account;
import com.banking.model.Customer;
public interface BankOperations {

    void createCustomer(Customer customer);
    void createAccount(Account account);
    void viewCustomerDetails(int customerId);
    void deposit(long accountNumber, double amount);
    void withdraw(long accountNumber, double amount);
    double checkBalance(long accountNumber);
    void transferMoney(long senderAccount, long receiverAccount, double amount);
    void viewTransactionHistory(long accountNumber);

}
