package com.thinkInJava.Chapter18;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
    public static void main(String[] args) throws IOException {
        String currentDir = "./src/com/thinkInJava/Chapter18/";
        StringReader in = new StringReader(BufferedInputFile.read(currentDir + "MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
        in.close();
    }
}
