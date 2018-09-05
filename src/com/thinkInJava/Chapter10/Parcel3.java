package com.thinkInJava.Chapter10;

public class Parcel3 {
    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
//        Parcel3.Contents c = p.new Contents();
        Parcel3.Contents c = new Parcel3.Contents();
        System.out.println(c.value());
        Parcel3.Destination d = p.new Destination("Tasmania");
    }

    private int testStatic1 = 1;
    public int testStatic2 = 1;

    static private void f1() {
    }

    static public void f2() {
    }

    static class Contents {
        static private int i = 11;

        public int value() {
            f1();
            f2();
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereto) {
            label = whereto;
        }

        String readLabel() {
            return label;
        }
    }
}
