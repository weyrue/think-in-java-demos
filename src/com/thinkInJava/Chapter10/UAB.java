package com.thinkInJava.Chapter10;

import static com.thinkInJava.Chapter6.Print.print;

public class UAB {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        int i = 5;
        for (; i > 0; i--) {
            b.insertU(a.v());
        }

        b.goThrough();
    }
}

interface U {
    void f();

    void g();

    void h();
}

class A {
    U v() {
        return new U() {
            @Override
            public void f() {
                print("U.f()");
            }

            @Override
            public void g() {
                print("U.g()");
            }

            @Override
            public void h() {
                print("U.h()");
            }
        };
    }
}

class B {
    private U[] uArray;

    private int pos = 0;

    public B() {
        uArray = new U[1];
    }

    public B(U[] uArray) {
        this.uArray = uArray;
    }

    void insertU(U u) {
        if (pos > (uArray.length - 1)) {
            U[] tmp = new U[uArray.length + 5];

            for (int i = 0; i < uArray.length; i++) {
                tmp[i] = uArray[i];
            }
            uArray = tmp;
        }
        uArray[pos++] = u;
    }

    void delete() {
        uArray = null;
    }

    void goThrough() {
        for (U u : uArray) {
            if(u!=null){
                u.f();
                u.g();
                u.h();
            }
        }
    }
}
