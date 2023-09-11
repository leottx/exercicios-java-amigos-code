package com.leonardotx;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "   amig os cod e  ";

        System.out.println(fixString(text));
    }

    public static String fixString(String text) {
        String[] fixedStringArray = text.trim().split("\\s+");
        StringBuilder fixedString = new StringBuilder();

        for (String word: fixedStringArray) {
            if (!word.isEmpty()) {
                fixedString.append(word);
            }
        }

        fixedString.replace(0, 1, fixedString.substring(0, 1).toUpperCase());

        return fixedString.toString();
    }
}