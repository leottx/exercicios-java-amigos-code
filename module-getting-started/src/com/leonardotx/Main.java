package com.leonardotx;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
            Write a program that reverses an array of Strings
            String[] content = {"you", "are", "how", "hello"}
            Tip. Use for loop and you to start at highest index.
            Output should be: hello how are you?. Note question mark at the end
        */

        String[] content = {"you", "are", "how", "hello"};
        String sentence = "";

        for (int i = content.length - 1; i >= 0; i--) {
            if (i != 0) {
                sentence += content[i] + " ";
                continue;
            }

            sentence += content[i] + "?";
        }

        System.out.println(sentence);
    }
}