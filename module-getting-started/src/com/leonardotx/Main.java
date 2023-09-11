package com.leonardotx;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // using your answer to Q6, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
        // NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
        // change the value at index 0 of the new array to "z"
        // print both of the arrays and compare

        String[] stringArray = {"a", "b", "c", "d"};
        String [] copyStringArray = Arrays.copyOf(stringArray, stringArray.length);

        copyStringArray[0] = "z";

        /* O método Arrays.copyOf() cria um novo espaço de memória do heap para que o novo array seja de fato uma cópia
        do array e não uma cópia do ponteiro */
        System.out.println(Arrays.toString(stringArray));
        System.out.println(Arrays.toString(copyStringArray));

        for (String str:
             stringArray) {
            System.out.println(str);
        }
    }
}