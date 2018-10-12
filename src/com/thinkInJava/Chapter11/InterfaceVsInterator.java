package com.thinkInJava.Chapter11;

import java.util.AbstractCollection;
import java.util.Iterator;

public class InterfaceVsInterator extends AbstractCollection<String> {

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }

            @Override
            public void remove() {

            }
        };
    }

    @Override
    public int size() {
        return 0;
    }
}
