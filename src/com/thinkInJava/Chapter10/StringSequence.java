package com.thinkInJava.Chapter10;

public class StringSequence {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass("abc");
        Inner ic = oc.innerClass();
        //    ic.toString();

        System.out.println(ic.toString());
//    OuterClass.Innerclass ic = new OuterClass.Innerclass();
    }

}

class OuterClass {
    private String str;

    OuterClass.Innerclass ic = new OuterClass.Innerclass();

    public OuterClass() {
    }

    public OuterClass(String str) {
        this.str = str;
    }

    class Innerclass implements Inner {
        public String toString() {
            return str;
        }
    }

    public Inner innerClass() {
        return new Innerclass();
    }
}

interface Inner {
    public String toString();
}

