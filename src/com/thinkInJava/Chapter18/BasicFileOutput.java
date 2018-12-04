package com.thinkInJava.Chapter18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

public class BasicFileOutput {
    public static void main(String[] args) throws IOException {
        String file = "BasicFileOutput.out";
        String currentDir = "./src/com/thinkInJava/Chapter18/";
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read(currentDir + "BasicFileOutput.java")));

//        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(currentDir + file)));
        PrintWriter out = new PrintWriter(currentDir + file);

        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null) {
            out.println(lineCount++ + ": " + s);
        }
        out.close();
        System.out.println(BufferedInputFile.read(currentDir + file));
        in.close();
    }
}
