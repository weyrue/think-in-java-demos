package com.thinkInJava.Chapter12;

public class InheritingException {
    public void f() throws SimpleException {
        System.out.println("Throwing SimpleException from f()");
        throw new SimpleException("abcd");
    }

    public static void main(String[] args) {
        InheritingException sed = new InheritingException();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.out.println("Caught it");
            e.printStackTrace();
        }
    }
}

class SimpleException extends Exception {
    public SimpleException() {
    }

    public SimpleException(String message) {
        super(message);
    }
}
