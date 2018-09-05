package com.thinkInJava.Chapter10;

public class Parcel11 {
    public static void main(String[] args) {
        Contents c = contents();
        Destination d = destination("Tasmania");
    }

    private static class ParcelContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return 0;
        }
    }

    protected static class ParcelDestination implements Destination {
        private String label;

        ParcelDestination(String whereTo) {
            label = whereTo;
        }

        public String readLabel() {
            return label;
        }

        public static void f() {

        }

        static int x = 10;

        static class AnotherLevel {
            public static void f() {
            }

            static int x = 10;
        }
    }

    public static Destination destination(String s) {
        return new ParcelDestination(s);
    }

    public static Contents contents() {
        return new ParcelContents();
    }
}

interface Contents {

    int value();
}

interface Destination {
    String readLabel();
}
