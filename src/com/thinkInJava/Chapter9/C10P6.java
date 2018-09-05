package com.thinkInJava.Chapter9;

public class C10P6 {
    public static void main(String[] args) {
        C10P6 cp = new C10P6();

        TestC6P10Impl testC6P10 = cp.getTestC6P10Impl();

        testC6P10.v();
    }

    private class TestC6P10Impl implements com.thinkInJava.Test.C10P6 {
        private int innerInt = 0;

        @Override
        public void f() {
            System.out.println("f() implements com.thinkInJava.Test.C10P6.");
        }

        public void v() {
            C10P6.this.outerInt = 2;
            System.out.println("C10P6.this.outerInt = " + C10P6.this.outerInt);
            C10P6.this.h();
        }
    }

    public void g() {
        TestC6P10Impl t = new TestC6P10Impl();
        t.innerInt = 1;
    }

    private int outerInt = 1;

    private void h() {
        System.out.println("h()");
    }

    public TestC6P10Impl getTestC6P10Impl() {
        return new TestC6P10Impl();
    }
}
