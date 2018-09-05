package com.thinkInJava.Chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.thinkInJava.Chapter6.Print.print;

public class ListFeatures {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        Collections.addAll(strs, "a", "b", "c", "d", "e", "f", "g");
        print("1: " + strs);
        strs.add("h");
        print("2: " + strs);
        print("3: " + strs.contains("h"));
        strs.remove("h");
        String str = strs.get(2);
        print("4: " + str + " " + strs.indexOf(str));
        print("5: " + strs.indexOf(new String()));
        print("6: " + strs.remove(new String()));
        print("7: " + strs.remove(str));
        print("8: " + strs);
        strs.add(3, "i");
        print("9: " + strs);
        List<String> sub = strs.subList(2, 5);
        print("sublist: " + sub);
        print("10: " + strs.containsAll(sub));
        Collections.sort(sub);
        print("Sorted sublist: " + sub);
        print("11: " + strs.containsAll(sub));
        Collections.shuffle(sub);
        print("Shuffled sublist: " + sub);
        print("12: " + strs.containsAll(sub));
        List<String> copy = new ArrayList<>(strs);
        print("sublist: " + sub);
        copy.retainAll(sub);
        print("13: " + copy);
        copy = new ArrayList<>(strs);
        copy.remove(2);
        print("14: " + copy);
        copy.retainAll(sub);
        print("15: " + copy);
        copy.removeAll(sub);
        print("16: " + copy);
        Object[] o = strs.toArray();
        print("22: " + o[3]);
        String[] sa = strs.toArray(new String[0]);
        print("23: " + sa[3]);

//        print("2: " + strs);
    }
}

class Pet {

}
