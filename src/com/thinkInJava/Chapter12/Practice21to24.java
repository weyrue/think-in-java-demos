package com.thinkInJava.Chapter12;

public class Practice21to24 {
    public static void main(String[] args) {
        try {
            new Child1();
        } catch (Parent1Exception e) {
            e.printStackTrace();
        }
    }
}

class Parent1Exception extends Exception{}
class Parent1 {
    public Parent1() throws Parent1Exception{
    }
}

class Child1 extends Parent1{
    public Child1() throws Parent1Exception {
        super();
    }
}

