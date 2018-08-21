package com.thinkInJava.Chapter7;

import static com.thinkInJava.Chapter6.Print.print;

public class PlaceSetting extends Custom {
    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate pl;

    public PlaceSetting(int i) {
        super(i + 1);
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        print("PlaceSetting Constructor.");
    }

    public static void main(String[] args) {
        // write your code here
        PlaceSetting x = new PlaceSetting(9);
    }
}

class Plate {
    Plate(int i) {
        print("Plate Constructor.");
    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        print("DinnerPlate Constructor.");
    }
}

class Utensil {
    Utensil(int i) {
        print("Utensil Constructor.");
    }
}

class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        print("Spoon Constructor.");
    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        print("Fork Constructor.");
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);
        print("Knife Constructor.");
    }
}

class Custom {
    Custom(int i) {
        print("Custom Constructor.");
    }
}

