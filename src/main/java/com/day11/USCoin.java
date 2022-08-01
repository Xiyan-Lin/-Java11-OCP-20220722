package com.day11;

// 定義 1美分: PENNY, 五美分: NICKLE, 
//     10美分: DIME, 25美分: QUARTER
public enum USCoin {
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
    private int value;
    private USCoin(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
