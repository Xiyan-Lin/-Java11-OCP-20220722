package com.day06;

public class A { // 父類
    public A() {
        this(10);
        System.out.println("A1");
    }
    public A(int x) {
        super(); // 呼叫 Object 建構子
        System.out.println("A2");
    }
}


