package com.day02;

public class AutoBoxingAndUnboxing {
    public static void main(String[] args) {
        // 外包類別
        // AutoBoxing 自動裝箱 : 例如: Integer.valueOf
        // AutoUnboxing 自動拆箱 : 例如: .intValue()
        // 在 Java 5.0 以前
        int a = 100;
        Integer a2 = Integer.valueOf(100);
        System.out.println("a: " + a);
        System.out.println("a2: " + a2.intValue());
        
        // 在 Java 5.0(含) 以後
        int b = 100;
        Integer b2 = 100;  // javac 會自動進行程式補全 Integer.valueOf(100); AutoBoxing 自動裝箱
        System.out.println("b: " + b);
        System.out.println("b2: " + b2); // javac 會自動進行程式補全 b2.intValue(); AutoUnboxing 自動拆箱
    }
}
