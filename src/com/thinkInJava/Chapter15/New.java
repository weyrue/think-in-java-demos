package com.thinkInJava.Chapter15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class New {
    public static void main(String[] args) {
        Map<String, List<String>> sls = New.map();
        New.<String, String>map();
    }

    public static <K, V> Map<K, V> map() {
        return new HashMap<>();
    }

}
