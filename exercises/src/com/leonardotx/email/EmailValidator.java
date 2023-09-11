package com.leonardotx.email;

public class EmailValidator {
    public boolean validateEmail(String email) {
        if (email == null || email.isEmpty() || !email.contains("@")) return false;

        return true;
    }
}
