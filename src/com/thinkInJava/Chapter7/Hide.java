package com.thinkInJava.Chapter7;

import static com.thinkInJava.Chapter6.Print.print;

public class Hide {
    public static void main(String[] args) {
        // write your code here
        Bart b = new Bart();
        b.doh(1);
        b.doh('x');
        b.doh(1.0f);
        b.doh(new MilHouse());
    }
}

class Homer {
    char doh(char c) {
        print("doh(char)");
        return 'd';
    }

    float doh(float f) {
        print("doh(float)");
        return 1.0f;
    }
}

class MilHouse {
}

class Bart extends Homer {
    void doh(MilHouse m) {
        print("doh(MilHouse)");
    }
}
