package com.day05;
// 四則運算的數學工具
public class Calc {
    private Calc() { // 不給 new
    }
    
    public static int add(int x, int y) {
        return x + y;
    }
    public static int sub(int x, int y) {
        return x - y;
    }
    public static int mul(int x, int y) {
        return x * y;
    }
    public static double div(int x, int y) {
        return (double)x / y;
    }
}
