package com.leonardotx;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path = "src/data.csv";
        String data = """
            id,first_name,last_name,email,gender
            1,Fanchette,Williamson,fwilliamson0@github.com,F
            2,Aleksandr,Matts,amatts1@webs.com,M
            3,Maurie,Cordero,mcordero2@google.co.jp,M
            4,Donnajean,Crowson,dcrowson3@google.com.hk,F
            5,Ricardo,Gofton,rgofton4@nytimes.com,M
            6,Gabie,Tregenna,gtregenna5@guardian.co.uk,F
            7,Marjorie,Blumsom,mblumsom6@joomla.org,F
            8,Lester,Huyghe,lhuyghe7@jugem.jp,M
            9,Merrily,Stangoe,mstangoe8@tiny.cc,F
            10,Reider,Karel,rkarel9@github.io,M
            11,Dory,Jolliff,djolliffa@wufoo.com,F
            12,Homerus,Averay,haverayb@skyrock.com,M
            13,Alyda,Muglestone,amuglestonec@is.gd,F
            14,Pinchas,Louca,ploucad@google.es,M
            15,Cherin,Eltringham,celtringhame@parallels.com,F
            16,Mufi,Rothert,mrothertf@dropbox.com,F
            17,Jordana,Everex,jeverexg@ucla.edu,F
            18,Belle,Rother,brotherh@auda.org.au,F
            19,Clevie,Sifflett,csiffletti@furl.net,M
            20,Gretchen,Abell,gabellj@1688.com,F
        """;

        try {
            File dataFile = createFile(path);
            writeOnFile(dataFile, data);
            readFile(dataFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static File createFile(String path) throws IOException {
        File file = new File(path);

        if (!file.exists()) {
            file.createNewFile();
        }

        return file;
    }

    public static void writeOnFile(File file, String content) throws IOException {
        FileWriter fw = new FileWriter(file);
        BufferedWriter bf = new BufferedWriter(fw);

        bf.write(content);
        bf.close();
    }

    public static void readFile(File file) throws IOException {
        Scanner sc = new Scanner(file);

        while(sc.hasNext()) {
            System.out.println(sc.nextLine());
        }

        sc.close();
    }

}