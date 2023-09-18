package com.leonardotx;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        String path = "src/test.txt";

        try {
            File newFile = createFile(path);
            writeOnFile(newFile, true, "Hello");
            writeOnFile(newFile, true, "World");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static File createFile(String path) throws IOException {
        File newFile = new File(path);

        if (!newFile.exists()) {
            newFile.createNewFile();
        }

        return newFile;
    }

    public static void writeOnFile(File file, boolean append, String content) throws IOException {
        FileWriter fileWriter = new FileWriter(file, append);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println(content);
        printWriter.flush();
        printWriter.close();
    }
}