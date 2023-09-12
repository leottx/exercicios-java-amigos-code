package com.leonardotx;

public class Main {
    public static void main(String[] args) {
        for(TShirtSize tshirt: TShirtSize.values()) {
            System.out.println(tshirt.toString().toLowerCase());
        }
    }
}