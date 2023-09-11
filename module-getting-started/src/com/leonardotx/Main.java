package com.leonardotx;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // create a for loop which goes through each string in our array
        // make each word uppercase
        // assign the value in the array to the uppercase string
        // print our resulting array

        String[] stringArray = {"i", "sure", "do", "love", "bees"};

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = stringArray[i].toUpperCase();
        }

        System.out.print(Arrays.toString(stringArray));
    }
}