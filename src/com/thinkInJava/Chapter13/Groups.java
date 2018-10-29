package com.thinkInJava.Chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.thinkInJava.Chapter6.Print.print;

public class Groups {
    public static void main(String[] args) {
//        // 找出最后三个单词
//        Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher((POEM));
//        while (m.find()) {
//            for (int j = 0; j <= m.groupCount(); j++) {
//                System.out.print("[" + m.group(j) + "]");
//            }
//            print();
//        }

        // 不已大写字母开头的词
        Matcher m = Pattern.compile("(?m)(\\b+|\\W+)([a-z]+)").matcher((POEM));
        m.lookingAt();
        m.matches();
        while(m.find()){
            print("Match \"" + m.group(2) + "\" at positions " + m.start() + "-" + (m.end() - 1));

        }
    }

    static public final String POEM =
            "twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "all mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws the catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";
}
