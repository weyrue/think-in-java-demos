package com.thinkInJava.Chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.thinkInJava.Chapter6.Print.print;

public class Practice11 {
    public static void main(String[] args) {
        String regex = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);

        while (m.find()) {
//            print("Match \"" + m.group() + "\" at positions " +
//                    m.start() + "-" + (m.end() - 1));
            print("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1));
        }
    }

    private static String str = "Arline ate eight apples and one orange while Antia hadn't any";
}
