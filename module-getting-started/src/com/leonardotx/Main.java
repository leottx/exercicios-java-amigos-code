package com.leonardotx;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] integers = new int[3];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = 4;
        }

        integers[1] = 17;

        System.out.print(Arrays.toString(integers));
    }
}