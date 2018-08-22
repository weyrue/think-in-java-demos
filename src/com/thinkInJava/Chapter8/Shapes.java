package com.thinkInJava.Chapter8;

import java.util.Random;

import static com.thinkInJava.Chapter6.Print.print;

public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }
        for (Shape shp : s) {
            shp.draw();
            shp.speak();
        }
    }
}

class Shape {
    public void draw() {
    }

    public void erase() {
    }

    public void speak(){
        print("I'm a shape.");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        print("Circle.draw()");
    }

    public void erase() {
        print("Circle.erase()");
    }
}

class Square extends Shape {
    public void draw() {
        print("Square.draw()");
    }

    public void erase() {
        print("Square.erase()");
    }
}

class Triangle extends Shape {
    public void draw() {
        print("Triangle.draw()");
    }

    public void erase() {
        print("Triangle.erase()");
    }
}

class RandomShapeGenerator {
    private Random rand = new Random(47);

    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}