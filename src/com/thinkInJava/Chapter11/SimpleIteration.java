package com.thinkInJava.Chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static com.thinkInJava.Chapter6.Print.print;

public class SimpleIteration {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        Collections.addAll(strs, "a", "b", "c", "d", "e", "f", "g");
        Iterator<String> it = strs.iterator();
        while (it.hasNext()) {
            String s = it.next();
            print("s: " + s);
        }

        print();

        for (String s : strs) {
            print("s: " + s);
        }

        print();

        it = strs.iterator();
        for (int i = 0; i < 6; i++) {
            it.next();
            it.remove();
        }
        print(strs);
    }
}
