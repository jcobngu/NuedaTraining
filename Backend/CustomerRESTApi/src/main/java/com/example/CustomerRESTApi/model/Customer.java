package com.example.CustomerRESTApi.model;

public class Customer {
    private String name;
    private String bank;
    private String id;
    private double income;
    private long routingNumber;
    private long accountNumber;
    private int creditScore;

    public Customer(String name, String bank, String id, double income, long routingNumber, long accountNumber, int creditScore) {
        this.name = name;
        this.bank = bank;
        this.id = id;
        this.income = income;
        this.routingNumber = routingNumber;
        this.accountNumber = accountNumber;
        this.creditScore = creditScore;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public long getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(long routingNumber) {
        this.routingNumber = routingNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
}
