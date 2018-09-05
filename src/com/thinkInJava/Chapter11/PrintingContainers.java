package com.thinkInJava.Chapter11;

import java.util.*;

import static com.thinkInJava.Chapter6.Print.print;

public class PrintingContainers {
    public static void main(String[] args) {
//        print(fill(new ArrayList<String>()));
//        print(fill(new LinkedList<String>()));
//        print(fill(new HashSet<String>()));
//        print(fill(new TreeSet<String>()));
//        print(fill(new LinkedHashSet<String>()));
//        print(fill(new HashMap<String, String>()));
//        print(fill(new TreeMap<String, String>()));
//        print(fill(new LinkedHashMap<String, String>()));

        print(containerGenerator(new ArrayList<String>()));
        print(containerGenerator(new LinkedList<String>()));
        print(containerGenerator(new HashSet<String>()));
        print(containerGenerator(new LinkedHashSet<String>()));
        print(containerGenerator(new TreeSet<String>()));

    }

    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }

    private static int pos = 0;
    private static final String filmName = "StarWar";

    static String characterGenerator() {
        if (pos >= filmName.length()) {
            pos = 0;
        }
        return String.valueOf(filmName.charAt(pos++));
    }

    static Collection containerGenerator(Collection<String> collection) {
        for (int i = 0; i < filmName.length(); i++) {
            collection.add(characterGenerator());
        }
        return collection;
    }
}


