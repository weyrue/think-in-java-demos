package com.thinkInJava.Chapter14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.thinkInJava.Chapter6.Print.print;

public class Practice8to10 {
    public static void main(String[] args) {
        acientTree(int.class);
        acientTree(new LinkedList<String>());
    }
    private static void acientTree(Object obj){
        Class c= obj.getClass();

        StringBuilder sb = new StringBuilder();
        sb.insert(0,c.getName());
        while((c=c.getSuperclass())!=null){
            sb.insert(0,c.getName()+" --> ");
        }
        print(sb.toString());
    }
}
