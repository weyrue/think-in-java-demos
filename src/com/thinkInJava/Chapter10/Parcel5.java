package com.thinkInJava.Chapter10;

public class Parcel5 {
    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
        System.out.println(d.readLabel());

        new Destination(){
            @Override
            public String readLabel() {
                return null;
            }
        };
    }

    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            public String readLabel() {
                return label;
            }
        }

        return new PDestination(s);
    }

    interface Destination {
        String readLabel();
    }

}
