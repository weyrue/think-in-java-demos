package com.thinkInJava.Chapter13;

import java.util.Arrays;

public class Splitting {
    public static void main(String[] args) {
        split(" ");
        split("\\W+");
        split("n\\W+");

        System.out.println(knights.replaceFirst("f\\w+", "located"));
        System.out.println(knights.replaceAll("Shrubbery|tree|herring", "banana"));
    }

    public static String knights =
            "Then, when you have found the Shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with ... a herring!";

    public static void split(String regex) {
        System.out.println(Arrays.toString(knights.split(regex)));
    }
}
