package com.leonardotx;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseString("Leonardo Teixeira"));
        System.out.println(reverseStringAlternative("Leonardo Teixeira"));
    }

    public static String reverseString(String text) {
        String[] textArray = text.split("");
        String reversedString = "";

        for (int i = text.length() - 1; i >= 0 ; i--) {
            reversedString += textArray[i];
        }

        return reversedString;
    }

    // Solução alternativa e mais otimizada
    public static String reverseStringAlternative(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Return the input as is for empty or null strings
        }

        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }
}