package com.banking.model;

import java.time.LocalDate;

public class SavingsAccount extends Account{

    private static final double MINIMUM_BALANCE = 500.00;

    public SavingsAccount(long accountNumber, int customerId, double accountBalance, LocalDate createdDate) {
        super(accountNumber, customerId, accountBalance, createdDate);
        
        if (accountBalance < MINIMUM_BALANCE) 
        {
            throw new IllegalArgumentException("Minimum balance required");
        }
    }

    
    
}
