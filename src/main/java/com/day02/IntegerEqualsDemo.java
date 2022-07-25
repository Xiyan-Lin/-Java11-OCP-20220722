package com.day02;

public class IntegerEqualsDemo {
    public static void main(String[] args) {
        // Integer 與 int 的比較
        Integer x = 100;  // 因為 auto-boxing, 要看成 Integer.valueOf(100)
        int y = 100;
        System.out.println("x == y: " + ( x == y )); // javac 自動補全 x.intValue() 自動拆箱
        System.out.println("x.intValue() == y: " + ( x.intValue() == y ));
        System.out.println("x.equals(y): " + x.equals(y)); // javac 自動補全 Integer.valueOf(y) 自動裝箱
    }
}
