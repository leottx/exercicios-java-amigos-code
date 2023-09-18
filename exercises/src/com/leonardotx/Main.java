package com.leonardotx;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String[] stringArray = new String[args.length];
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            try {
                sum += Integer.parseInt(args[i]);
            } catch(NumberFormatException e){
                stringArray[i] = args[i];
                System.out.println(e.getMessage());
            }
        }

        sb.append("Total sum: " + sum);

        if (!Arrays.stream(stringArray).allMatch(Objects::isNull)) {
            for (String item: stringArray) {
                if(item != null) {
                    sb.append(" " + item);
                }
            }
            sb.append(" are not number(s)");
        }

        System.out.println(sb.toString());
    }
}