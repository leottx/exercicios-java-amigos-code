package com.leonardotx;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // É exibida a exceção "ArrayIndexOutOfBoundsException", pois o índice 5 não existe para o array de tamanho 5.
        numbers[5] = 6;
    }
}