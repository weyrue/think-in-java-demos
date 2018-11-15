package com.thinkInJava.Chapter15;

import static com.thinkInJava.Chapter15.Tuple.tuple;

public class TupleTest2 {
    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f2();
        System.out.println(ttsi);

//        System.out.println(f2());
    }

    static TwoTuple<String, Integer> f() {
        return tuple("hi", 47);
    }

    static TwoTuple f2() {
        return tuple("hi", 47);
    }
}
