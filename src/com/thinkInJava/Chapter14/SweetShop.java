package com.thinkInJava.Chapter14;

import static com.thinkInJava.Chapter6.Print.print;

public class SweetShop {
    public static void main(String[] args) {
        print("Inside main");
        new Candy();
        print("After creating Candy");

        try {
            Class.forName("com.thinkInJava.Chapter14.Gum");
        } catch (ClassNotFoundException e) {
            print("Couldn't find Gum");
        }
        print("After Class.forName(\"Gum\")");
        new Cookie();
        print("After creating Cookie");
    }
}

class Candy {
    static {
        print("Loading Candy");
    }
}

class Gum {
    static {
        print("Loading Gum");
    }
}

class Cookie {
    static {
        print("Loading Cookie");
    }
}
