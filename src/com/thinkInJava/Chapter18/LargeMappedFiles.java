package com.thinkInJava.Chapter18;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

import static com.thinkInJava.Chapter6.Print.print;
import static com.thinkInJava.Chapter6.Print.printnb;

public class LargeMappedFiles {
    static int length = 0x8ff;

    public static void main(String[] args) throws Exception {
        MappedByteBuffer out = new RandomAccessFile("./src/com/thinkInJava/Chapter18/test.dat", "rw")
                .getChannel()
                .map(FileChannel.MapMode.READ_WRITE, 0, length);
        for (int i = 0; i < length; i++) out.put((byte) 'x');
        print("Finish writing");
        for (int i = length / 2; i < length / 2 + 6; i++)
            printnb((char) out.get(i));

    }
}
