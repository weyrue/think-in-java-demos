package com.thinkInJava.Chapter15;

public class GenerateBase<T> {
}

class Derived2 extends GenerateBase{}

class Derived3<? extends String> extends GenerateBase<? extends String>{}

