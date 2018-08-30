package com.thinkInJava.Chapter9;

import static com.thinkInJava.Chapter6.Print.print;

public class Apply {
    public static void process(Processor p, Object s) {
        print("Using processor " + p.name());
        print(p.process(s));
    }
}
