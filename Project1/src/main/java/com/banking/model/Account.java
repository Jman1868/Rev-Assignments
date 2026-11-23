package com.banking.model;

import java.time.LocalDate;

public abstract class Account {

    private long accountNumber;
    private int customerId;
    private double accountBalance;
    private LocalDate createdDate;

    public Account(long accountNumber, int customerId, double accountBalance, LocalDate createdDate) {
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.accountBalance = accountBalance;
        this.createdDate = createdDate;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
            return "Account{" +
            "accountNumber=" + accountNumber +
            ", customerId=" + customerId +
            ", accountBalance=" + accountBalance +
            ", createdDate=" + createdDate +
            '}';
    }
    

}
