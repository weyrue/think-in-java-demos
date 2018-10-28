package com.thinkInJava.Chapter13;

import java.util.LinkedList;
import java.util.List;

public class InfiniteRecursion {
    public static void main(String[] args) {
        List<InfiniteRecursion> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new InfiniteRecursion());
        }
//        System.out.println(list);

        ChildA c = new ChildA();
        System.out.println(c);
    }

    @Override
    public String toString() {
        return "InfiniteRecursion address: " + super.toString() + "\n";
    }
}

class ParentA {
    @Override
    public String toString() {
        return "ParentAParentAParentAParentA";
//        return super.toString();
    }
}

class ChildA extends ParentA {
    @Override
    public String toString() {
        return String.valueOf(Integer.toHexString(hashCode()));
    }
}
