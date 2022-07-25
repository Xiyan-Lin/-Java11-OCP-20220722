package com.day03;

import java.util.Arrays;

public class MultiArrayDemo8 {
    public static void main(String[] args) {
        // 陣列長度與字串長度
        String x = "Java";
        String[] y = {"Java", "VB", "Python"};
        System.out.printf("x 字串: %s, 長度: %d\n", x, x.length());
        System.out.printf("y 陣列: %s, 長度: %d\n", Arrays.toString(y), y.length);
        
        // 有名字三組請計算出平均名字的字數
        String[] names = {"Vincent", "Anita", "Bob"};
        //                   7個字     5個字   3個字
        double avg = Arrays.stream(names)  // {"Vincent", "Anita", "Bob"}
                           //.mapToInt(name -> name.length()) // {7, 5, 3}
                           .mapToInt(String::length) // {7, 5, 3}
                           .average()
                           .getAsDouble();
        System.out.println(avg);        
    }
}
