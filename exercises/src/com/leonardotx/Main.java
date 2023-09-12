package com.leonardotx;

public class Main {
    public static void main(String[] args) {
        System.out.println(countWordsInSentence("hello world"));
    }

    public static int countWordsInSentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        return sentence.split(" ").length;
    }
}