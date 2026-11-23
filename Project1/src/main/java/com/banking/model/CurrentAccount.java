package com.banking.model;

import java.time.LocalDate;

public class CurrentAccount extends Account{

    public CurrentAccount(long accountNumber, int customerId, double accountBalance, LocalDate createdDate){
        super(accountNumber,customerId,accountBalance,createdDate);
    }
    
}
