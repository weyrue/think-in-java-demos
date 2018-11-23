package com.thinkInJava.Chapter15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ClassTypeCature<T> {
    public static void main(String[] args) {
        ClassTypeCature<HashMap> ctt1 = new ClassTypeCature<>(HashMap.class);
        System.out.println(ctt1.f(new HashMap<String, Class<?>>()));

        Generic<String>[] gia;

        gia = new Generic[10];

        List<? extends Number> list = Arrays.asList(new Integer(10));
        Integer a = (Integer)list.get(0);

    }

    Class<T> kind;

    public ClassTypeCature(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    <T> T readExact1(List<T> list){return list.get(0);}
        T readExact2(List<T> list){return list.get(0);}
        T readExact3(List<? extends T> list){return list.get(0);}
}

class Generic<T> {
}
