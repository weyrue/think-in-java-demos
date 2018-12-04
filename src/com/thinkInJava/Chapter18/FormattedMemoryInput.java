package com.thinkInJava.Chapter18;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        String currentDir = "./src/com/thinkInJava/Chapter18/";
        try {
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read(currentDir + "FormattedMemoryInput.java").getBytes()));
            while (in.available() > 0) {
                System.out.print((char) in.readByte());
            }
        } catch (IOException e) {
            System.err.println("End of stream");
        }
    }
}
