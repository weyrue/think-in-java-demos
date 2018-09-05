package com.thinkInJava.Chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import static com.thinkInJava.Chapter6.Print.print;

public class ListIteration {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        Collections.addAll(strs, "a", "b", "c", "d", "e", "f", "g");
        ListIterator<String> it = strs.listIterator();

        while (it.hasNext()) {
            print(it.next() + ", " + it.nextIndex() + ", " + it.previousIndex() + ";");
        }
        print();

        while (it.hasPrevious()) {
            print(it.previous());
        }

        it = strs.listIterator(3);
        it.next();
        it.set("cat");
        print(strs);

    }
}
