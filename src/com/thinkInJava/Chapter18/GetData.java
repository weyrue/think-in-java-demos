package com.thinkInJava.Chapter18;

import java.nio.ByteBuffer;

import static com.thinkInJava.Chapter6.Print.print;

public class GetData {
    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);

        int i = 0;
        while (i++ < bb.limit()) {
            if (bb.get() != 0) {
                print("nonzero");
            }
        }
        print("i = " + i);
        bb.rewind();

        bb.asIntBuffer().put(99471124);
        print(bb.getInt());
        bb.rewind();

        bb.asFloatBuffer().put(99471124);
        print(bb.getFloat());
        bb.rewind();
    }
}
