package com.thinkInJava.Chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.thinkInJava.Chapter6.Print.print;

public class Finding {
    public static void main(String[] args) {
        Matcher m = Pattern.compile("\\w+").matcher("Everything is full of Linnet's wings");
        while (m.find()) System.out.print(m.group() + " ");
        print();
        int i = 0;
        while (m.find(i)) {
            System.out.print(m.group() + " ");
            i++;
        }
    }
}
