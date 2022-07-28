package com.day07;

public class Sub extends Base {
    int value = 200;
    @Override
    void print() {
        System.out.println("Sub");
    }
    public void access() {
        int value = 300;
        System.out.println(value);
        System.out.println(this.value);
        System.out.println(super.value);
    }
}
