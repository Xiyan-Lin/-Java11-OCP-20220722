package com.day20;

public class Cookies {
    
    public synchronized void eat(int n) {
        System.out.printf("小狗吃了第 %d 片餅乾\n", n);
    }
    
    public synchronized void put(int n) {
        System.out.printf("主人放了第 %d 片餅乾\n", n);
    }
}
