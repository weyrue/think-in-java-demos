package com.thinkInJava.Chapter7;

import java.util.Date;
import java.util.Random;

import static com.thinkInJava.Chapter6.Print.print;

public class FinalData {
    private static final Random rand = new Random(47);

    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    //can be compile-time constants
    private final int valueOne = 9;
    private static final int VALUE_TWO = 99;

    // typical public constants
    public static final int VALUE_THREE = 39;

    //Cannot be compile-time constants
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);

    //arrays
    private final int[] a = {1, 2, 3, 4, 5, 6};

    @Override
    public String toString() {
        return "FinalData{" +
                "id='" + id + '\'' +
                ", i4=" + i4 +
                ", INT_5=" + INT_5 +
                '}';
    }

    public static void main(String[] args) {
        // write your code here
        FinalData fd1 = new FinalData("fd1");
//        fd1.valueOne++;
        fd1.v2.i++;
        fd1.v1 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++;
        }
//        fd1.v2 = new Value(0);
//        fd1.VAL_3 = new Value(1);
//        fd1.a = new int[3];

        print(fd1);
        print("Creating new final data");
        FinalData fd2 = new FinalData("fd2");
        print(fd1);
        print(fd2);

    }
}

class Value {
    int i;

    public Value(int i) {
        this.i = i;
    }
}
