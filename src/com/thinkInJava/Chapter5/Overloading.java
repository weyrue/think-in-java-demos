package com.thinkInJava.Chapter5;

public class Overloading {
    public static void main(String[] args) {
        PracticeString s1 = new PracticeString("cde");
//        PracticeString s2 = new PracticeString();
//        if (s1.getStr() == null) {
//            System.out.println("s is null.");
//        } else {
//            System.out.println("s is not null.");
//        }
//
////        s1.str = "def";
//        System.out.println("s1.str == s2.str? " + s2.str == s1.str);

        System.out.println("str1: " + s1.getStr1());
        System.out.println("str2: " + s1.getStr2());
        System.out.println("str3: " + s1.getStr3());
    }

}

class PracticeString {
    private String str1 = "abc";
    private String str2 = null;
    private String str3 = str2;

    public PracticeString(String str2) {
        this.str2 = str2;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public String getStr3() {
        return str3;
    }

    public void setStr3(String str3) {
        this.str3 = str3;
    }
}
