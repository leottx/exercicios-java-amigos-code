package com.leonardotx;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(capitalizeFirstLetter("hello world"));
    }

    public static String capitalizeFirstLetter(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }

        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}