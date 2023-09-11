package com.leonardotx;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // using your answer from Q5 above, create a second array which is initialized using your original array
        // hint: instead of using the `new` keyword, try simply giving the name of your original array
        // change the value at index 0 of the new array to "z"
        // print both of your arrays and compare

        String[] stringArray = {"a", "b", "c", "d"};
        String [] copyStringArray = stringArray;

        copyStringArray[0] = "z";

        /* Ambos são alterados pois arrays são reference types, ou seja, cada variável na stack é um ponteiro para o
        mesmo espaço de memória no heap */
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(copyStringArray));
    }
}