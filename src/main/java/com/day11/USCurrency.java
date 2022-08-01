package com.day11;

// 定義 1美分: PENNY, 五美分: NICKLE, 
//     10美分: DIME, 25美分: QUARTER
public class USCurrency {
    private int value;
    public USCurrency(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
