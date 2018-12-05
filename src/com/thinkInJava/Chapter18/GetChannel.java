package com.thinkInJava.Chapter18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class GetChannel {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception {
        FileChannel fc = new FileOutputStream("./src/com/thinkInJava/Chapter18/data.txt").getChannel();

        fc.write(ByteBuffer.wrap("Some text ".getBytes()));
        fc.close();

        fc = new RandomAccessFile("./src/com/thinkInJava/Chapter18/data.txt", "rw").getChannel();
        fc.position(fc.size());
        fc.write(ByteBuffer.wrap("Some more".getBytes()));
        fc.close();

        fc = new FileInputStream("./src/com/thinkInJava/Chapter18/data.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();

        System.out.println(Charset.forName(System.getProperty("file.encoding")).decode(buff));
//        while (buff.hasRemaining())
//            System.out.print((char) buff.get());
    }
}
