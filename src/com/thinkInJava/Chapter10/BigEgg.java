package com.thinkInJava.Chapter10;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BigEgg extends Egg {
    public static void main(String[] args) {
//        new Egg();
//        new BigEgg();

//        BigEgg bg = new BigEgg();
//        bg.new Yolk();

        new BigEgg().new Yolk();

    }

    public class Yolk extends Egg.Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk()");
        }
    }
}

class Egg {
    private Yolk y;

    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }

    public Egg() {
        System.out.println("New Egg()");
        y = new Yolk();
    }
}
