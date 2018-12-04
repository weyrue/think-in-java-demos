package com.thinkInJava.Chapter18;

import java.io.*;

public class StoringAndRecoveringData {
    public static void main(String[] args) throws IOException {
        String currentDir = "./src/com/thinkInJava/Chapter18/";
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(currentDir + "aaa.txt")));
        out.writeDouble(3.14159);
        out.writeUTF("This is pi.");
        out.writeDouble(1.41413);
        out.writeUTF("Square root of 2.");
        out.close();
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(currentDir + "aaa.txt")));
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
        in.close();

    }
}
