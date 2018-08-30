package com.thinkInJava.Chapter9;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Adventure {
    public static void main(String[] args) {
        int c = CanFight.i;
        try {
            Field field = CanFight.class.getField("i");
            System.out.println(Modifier.toString(field.getModifiers()));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

interface CanFight {
    int i = 0;

    void fight();
}

interface CanSwim extends CanFight {
    void swim();
}

interface CanFly extends CanFight {
    void fly();
}

interface CanDrive extends CanSwim, CanFly {
    void drive();
}
