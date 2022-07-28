package com.day06;

// 加法器(工具)
public class Calc {
    public static int add(int... nums) {
        int sum = 0;
        for(int n : nums) {
            sum += n;
        }
        return sum;
    }
}
