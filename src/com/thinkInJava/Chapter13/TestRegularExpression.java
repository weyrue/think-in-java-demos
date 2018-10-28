package com.thinkInJava.Chapter13;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.thinkInJava.Chapter6.Print.print;

public class TestRegularExpression {
    public static void main(String[] args) {
        if (args.length < 1 ) {
            print("Usage:\njava TestRegularExpression " +
                    "characterSequence regularExpression+");
            System.exit(0);
        }
        print("Input: \"" + str + "\"");
        for (String arg : args) {
            print("Regular Expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(str);
            while (m.find()) {
                print("Match \"" + m.group() + "\" at positions " +
                        m.start() + "-" + (m.end() - 1));
            }
        }
    }

    private static String str = "Java now has regular expressions";
}
