package com.banking.operations;

import java.util.ArrayList;

import com.banking.BankOperations;
import com.banking.exception.InsufficientBalanceException;
import com.banking.exception.InvalidAccountException;
import com.banking.model.Account;
import com.banking.model.Customer;

public class BankingOperations implements BankOperations {

    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Account> accounts = new ArrayList<>();


    @Override
    public void createCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer created successfully!");
    }

    @Override 
    public void createAccount(Account account){
        accounts.add(account);
        System.out.println("Account created successfully!");
    }

    @Override
    public void viewCustomerDetails(int customerId){

    }
    
    @Override 
    public void deposit(long accountNumber, double amount){
        
    }

    @Override 
    public void withdraw(long accountNumber, double amount) throws InsufficientBalanceException, InvalidAccountException{
        double accbalance = checkBalance(accountNumber);
        if (amount > accbalance) 
        {
            throw new InsufficientBalanceException("Insufficient funds!");  
        }
    }

    @Override 
    public double checkBalance(long accountNumber) throws InvalidAccountException{
        
        for (Account account : accounts){
            long accnumber = account.getAccountNumber();
            if(accnumber==accountNumber){
                return account.getAccountBalance();
            }
        }
         throw new InvalidAccountException("Account not found!");
    }

    @Override 
    public void transferMoney(long senderAccount, long receiverAccount, double amount){

    }

    @Override 
    public void viewTransactionHistory(long accountNumber){

    }





}
