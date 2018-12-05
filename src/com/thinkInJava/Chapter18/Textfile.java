package com.thinkInJava.Chapter18;

import java.io.*;
import java.util.ArrayList;

public class Textfile extends ArrayList<String> {
    public static String read(String fileName) {
        StringBuilder sb = new StringBuilder();

        try {
            BufferedReader in = new BufferedReader(new FileReader(new File(fileName).getAbsoluteFile()));

            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
