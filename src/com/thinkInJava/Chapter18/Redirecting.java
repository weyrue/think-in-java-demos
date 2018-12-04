package com.thinkInJava.Chapter18;

import java.io.*;

public class Redirecting {
    public static void main(String[] args) throws IOException {
        PrintStream console = System.out;
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("./src/com/thinkInJava/Chapter18/Redirecting.java"));
        PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("./src/com/thinkInJava/Chapter18/test.out")));
        System.setIn(in);
        System.setOut(out);
        System.setErr(out);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = bf.readLine()) != null) {
            System.out.println(s);
        }

        out.close();
        System.setOut(console);
    }
}
