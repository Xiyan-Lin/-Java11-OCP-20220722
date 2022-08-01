package com.day11;

// 外部類別
public class Outer {
    private int x = 1000; // Outer 物件變數
    static int y = 2000;
    // 內部類別
    public class Inner {
        private int x = 100; // Inner 物件變數
        // static int y = 200; // 不可放 static 成員
        public void print() {
            int x = 10; // 區域變數
            System.out.println(x); // 10
            System.out.println(this.x); // 100
            System.out.println(Outer.this.x); // 1000, Outer 物件變數
        }
    }
    // static(靜態)內部類別
    public static class SInner {
        static int y = 200;
        public static void print() {
            int y = 20;
            System.out.println(y);
            System.out.println(SInner.y);
            System.out.println(Outer.y);
        }
    }
    
}
