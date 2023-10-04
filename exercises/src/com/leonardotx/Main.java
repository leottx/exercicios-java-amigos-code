package com.leonardotx;

import com.leonardotx.entities.BankAccount;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount("leonardo", new BigDecimal("1500.00"), false);
        System.out.println(bankAccount);

        System.out.println("Enter withdraw amount: ");
        BigDecimal amount = scanner.nextBigDecimal();

        System.out.println(bankAccount.withdraw(amount));

        System.out.println(bankAccount);
    }
}