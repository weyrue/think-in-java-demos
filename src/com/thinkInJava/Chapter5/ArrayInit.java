package com.thinkInJava.Chapter5;

public class ArrayInit {
    public static void main(String[] args) {
        ele[] eleArray = {new ele("a"),new ele(),};
    }
}

class ele {
    String str;

    ele() {
        System.out.println("none");
    }

    ele(String str) {
        this.str = str;
        System.out.println("str");
    }

}
