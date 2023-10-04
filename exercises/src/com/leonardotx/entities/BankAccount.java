package com.leonardotx.entities;

import java.math.BigDecimal;

public class BankAccount {
    String name;
    BigDecimal balance;
    boolean hasOverdraft;


    public BankAccount(String name, BigDecimal balance, boolean hasOverdraft) {
        this.name = name;
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
    }

    public BigDecimal withdraw(BigDecimal amount) {
        if (balance.subtract(amount).compareTo(BigDecimal.ZERO) >= 0) {
            balance = balance.subtract(amount);
            return amount;
        }

        return BigDecimal.ZERO;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", hasOverdraft=" + hasOverdraft +
                '}';
    }
}
