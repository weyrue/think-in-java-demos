package com.thinkInJava.Chapter10;

public class DotThis {
    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();

        DotThis.Inner dti2 = dt.new Inner();

        dti.outer().f();
        dti2.outer().f();
    }

    void f() {
        System.out.println("DotThis.f()");
    }

    private class Inner {
        public DotThis outer() {
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }
}
