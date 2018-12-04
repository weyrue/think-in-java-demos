package com.thinkInJava.Chapter18;

import java.io.*;

public class BufferedInputFile {
    public static void main(String[] args) throws IOException {
        String currentDir = "./src/com/thinkInJava/Chapter18/";
        System.out.println(read(currentDir + "BufferedInputFile.java"));
    }

    public static String read(String fileName) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null) {
//            sb.append(s + "\n");
            sb.append(s + "\n");
        }
        in.close();
        return sb.toString();
    }
}
