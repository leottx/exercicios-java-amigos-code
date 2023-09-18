package com.leonardotx;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File newFile = new File("src/test.txt");
            Scanner sc = new Scanner(newFile);
            readFile(sc);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readFile(Scanner sc) {
        while(sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}