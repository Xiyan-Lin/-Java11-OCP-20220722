package com.day06;

public class B extends A { // 子類
    public B() {
        super(10);
        System.out.println("B1");
    }
    public B(int x) {
        this();
        System.out.println("B2");
    }
}
