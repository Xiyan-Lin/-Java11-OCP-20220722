package com.day07;

public class Sub extends Base {
    int value = 200;
    @Override
    void print() {
        System.out.println("Sub");
    }
    public void access() {
        int value = 300;
        System.out.println(value); // 300
        System.out.println(this.value); // 200
        System.out.println(super.value); // 100
        print(); // 執行 Sub(自己) 的 print() 的方法
        this.print(); // 執行 Sub(自己) 的 print() 的方法
        super.print(); // 執行 Base 的 print() 的方法
    }
}
