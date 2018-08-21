package com.thinkInJava.Chapter7;

import static com.thinkInJava.Chapter6.Print.print;

public class AmphibianAndFrog {

    public static void main(String[] args) {
        // write your code here
//        Amphibian am = new frog();
//        am.bark();
        bark(new Frog());
    }

    private static void bark(Amphibian am) {
        am.bark();
    }
}

class Amphibian {
    void bark() {
        print("Biu Biu Biu");
    }
}

class Frog extends Amphibian {
    @Override
    void bark() {
        print("Gua Gua Gua");
    }
}
