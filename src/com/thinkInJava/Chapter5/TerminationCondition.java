package com.thinkInJava.Chapter5;

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);

        novel.checkIn();

        new Book(true);
        System.gc();

    }
}

class Book {
    boolean checkedOut = false;

    Book(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    protected void finalize() {
        if (checkedOut) System.out.println("Error: checked out");
    }
}
