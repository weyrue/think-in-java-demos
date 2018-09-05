package com.thinkInJava.Chapter10;

public class InheritInner extends WithInner.Inner{

    InheritInner(WithInner wi){
        wi.super();
    }
}

class WithInner {
    class Inner {

    }
}

