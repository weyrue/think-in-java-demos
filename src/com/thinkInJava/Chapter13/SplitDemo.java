package com.thinkInJava.Chapter13;

import java.util.Arrays;
import java.util.regex.Pattern;

import static com.thinkInJava.Chapter6.Print.print;

public class SplitDemo {
    public static void main(String[] args) {
        String input = "This!!unusal use!!of exclamation!!points";
        print(Arrays.toString(Pattern.compile("u|o").split(input)));
        print(Arrays.toString(Pattern.compile("!!").split(input, 3)));
    }
}
