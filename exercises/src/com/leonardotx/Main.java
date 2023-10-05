package com.leonardotx;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] languages = new String[]{"javascript", "java"};
        Programmer javaProgrammer = new Programmer("Leonardo", 27, "São Paulo", "junior", languages);

        System.out.println(Arrays.toString(javaProgrammer.getProgrammingLanguages()));
    }
}