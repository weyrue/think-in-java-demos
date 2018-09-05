package com.thinkInJava.Chapter11;

import java.util.*;

public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Integer[] moreInts = {1, 2, 3, 4, 5};

        collection.addAll(Arrays.asList(moreInts));

        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.set(1, 99);
//        list.add(21);

        int n = 100000000;

        long startA = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        }
        long endA = System.currentTimeMillis();
        System.out.println("Arrays.asList(" + n + ") costs " + (endA - startA) + " Milliseconds.");

        long startB = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            collection = new ArrayList<>();
            collection.addAll(list);
//            Collections.addAll(collection, moreInts);
        }
        long endB = System.currentTimeMillis();
        System.out.println("Collections.addAll(" + n + ") costs " + (endB - startB) + " Milliseconds.");

    }
}
