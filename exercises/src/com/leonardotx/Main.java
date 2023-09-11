package com.leonardotx;

import com.leonardotx.email.EmailValidator;

public class Main {
    public static void main(String[] args) {
        EmailValidator email1 = new EmailValidator();
        EmailValidator email2 = new EmailValidator();

        System.out.println(email1.validateEmail("fake@fake.com"));
        System.out.println(email2.validateEmail("test.com"));
    }
}