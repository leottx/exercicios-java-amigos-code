package com.leonardotx;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"hello", "bingo", "ola", "bye", "ciao"};

        System.out.println(getLongest(stringArray));
    }

    public static String getLongest(String[] stringArray) {
        String longestString = stringArray[0];

        for (int i = 0; i < stringArray.length ; i++) {
            if (longestString.length() > stringArray[i].length()) {
                continue;
            }

            longestString = stringArray[i];
        }

        return longestString;
    }

    // Solução alternativa e mais completa, pois trata casos com argumento nulo ou String vazia e também palavras repetidas ou de mesmo tamanho.
    public static String getLongest(String[] stringArray) {
        if(stringArray == null || stringArray.length == 0) {
            return "";
        }

        int maxLength = 0;
        String longestString = "";

        for (String str:
             stringArray) {
            if (str.length() > maxLength) {
                maxLength = str.length();
                longestString = str;
                continue;
            }

            if (str.length() == maxLength && !longestString.contains(str)) {
                longestString += ", " + str;
            }
        }

        return longestString;
    }
}