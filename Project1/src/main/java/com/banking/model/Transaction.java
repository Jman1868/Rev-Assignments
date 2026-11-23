package com.banking.model;

import java.time.LocalDateTime;

public class Transaction {

    private int transactionId;
    private long accountNumber;
    private String transactionType;
    private double amount;
    private String transactionReference;
    private LocalDateTime transactionDate;

    public Transaction(int transactionId, long accountNumber, String transactionType, double amount, String transactionReference, LocalDateTime transactionDate) {
        
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionReference = transactionReference;
        this.transactionDate = transactionDate;
    }

    public Transaction(long accountNumber, String transactionType, double amount, String transactionReference, LocalDateTime transactionDate) {
        
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionReference = transactionReference;
        this.transactionDate = transactionDate;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }


    @Override 
    public String toString(){

            return "Transaction{" +
            "transactionId=" + transactionId +
            ", accountNumber=" + accountNumber +
            ", transactionType='" + transactionType + '\'' +
            ", amount=" + amount +
            ", transactionReference='" + transactionReference + '\'' +
            ", transactionDate=" + transactionDate +
            '}';
    }
    




}
