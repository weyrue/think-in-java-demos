package com.thinkInJava.Chapter3;

public class URShift {
    public static void main(String[] args) {
        // write your code here
//        int i = 0x5;
//        i >>>= 10;
//        System.out.println(i);
//        long l = -1;
//        l >>>= 10;
//        System.out.println(l);
//        short s = -1;
//        s >>>= 10;
//        System.out.println(s);
//        byte b = -1;
//        b >>>= 10;
//        System.out.println(b);

        int a = 0xa;
        int b = 0x5;
        System.out.println("a & b: " + String.valueOf(a & b));
        System.out.println("a | b: " + String.valueOf(a | b));
        System.out.println("~a: " + String.valueOf(~a));

    }
}
