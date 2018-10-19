package com.thinkInJava.Chapter12;

import static com.thinkInJava.Chapter6.Print.*;

public class AlwaysFinally {
    public static void main(String[] args) {
        print("Entering first try block.");
        try {
            print("Entering second try block.");
            try {
                throw new RuntimeException();
            }
            finally {
                print("Finally in 2nd try block.");
            }
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Caught FourException in 1st try block.");
        }
//        finally {
//            print("Finally in 2nd try block.");
//        }

    }
}
class FourException extends Exception{}
