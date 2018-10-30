package com.thinkInJava.Chapter14;

import static com.thinkInJava.Chapter6.Print.print;

public class ToyTest {
    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.thinkInJava.Chapter14.FancyToy");
        } catch (ClassNotFoundException e) {
            print("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);

        for (Class face : c.getInterfaces()) printInfo(face);

        Class up = c.getSuperclass();
        Object obj = null;

        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            print("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            print("Can't access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }

    static void printInfo(Class cc) {
        print("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
        print("Simple name: " + cc.getSimpleName());
        print("Canonical name: " + cc.getCanonicalName());
    }
}

interface HasBetteries {
}

interface WaterProof {
}

interface Shoots {
}

class Toy {
    Toy() {
    }

    Toy(int i) {
    }
}

class FancyToy extends Toy implements HasBetteries, WaterProof, Shoots {
    public FancyToy() {
        super(1);
    }
}
