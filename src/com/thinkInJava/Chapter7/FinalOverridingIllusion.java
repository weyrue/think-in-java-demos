package com.thinkInJava.Chapter7;

import static com.thinkInJava.Chapter6.Print.print;

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        OverridingPrivate op = op2;
    }

}

class WithFinal {
    private final void f() {
        print("WithFinal.f()");
    }

    private void g() {
        print("WithFinal.g()");
    }

    public final void h() {
        print("WithFinal.h()");
    }
}

class OverridingPrivate extends WithFinal {
    //    @Override
    private final void f() {
        print("OverridingPrivate.f()");
    }

    private void g() {
        print("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    //    @Override
    public final void f() {
        print("OverridingPrivate2.f()");
    }

    public void g() {
        print("OverridingPrivate2.g()");
    }
}

class OverridingFinal extends WithFinal {
//    @Override
//    public final void h() {
//        print("OverridingFinal.h()");
//    }
}

