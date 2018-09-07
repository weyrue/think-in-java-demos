package com.thinkInJava.Chapter11;

import java.util.Collections;
import java.util.LinkedList;

import static com.thinkInJava.Chapter6.Print.print;

public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<String> strs = new LinkedList<>();
        Collections.addAll(strs, "a", "b", "c", "d", "e", "f", "g");
        print("strs.getFirst(): " + strs.getFirst());
        print("strs.element(): " + strs.element());
        print("strs.peek(): " + strs.peek());
        print("strs.remove(): " + strs.remove());
        print("strs.poll(): " + strs.poll());
    }
}
