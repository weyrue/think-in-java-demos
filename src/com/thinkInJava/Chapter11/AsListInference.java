package com.thinkInJava.Chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AsListInference {
    public static void main(String[] args) {

        Snow[] t1 = testArrayParams(new Light(), new Heavy());
        Snow[] t2 = testArrayParams(new Light());
        Snow[] t3 = testArrayParams(new Light(), new Slush(), new Heavy());

        List<Snow> list;

//        list = Arrays.asList(new Light(), new Heavy());
//        Arrays.asList(1, "2");

        Snow[] s1 = {new Light(), new Heavy()};
//        List<Snow> list1 = Arrays.asList(new Light(), new Heavy());

//        list = new ArrayList<Powder>();
//        Collections.addAll(list, new Crusty(), new Light(), new Heavy());



        list = new ArrayList<>();

        list.add(new Light());
    }

    static <T> T[] testArrayParams(T... a) {
        return a;
    }
}

class Snow {
}

class Powder extends Snow {
}

class Light extends Powder {
}

class Heavy extends Powder {
}

class Crusty extends Snow {
}

class Slush extends Snow {
}