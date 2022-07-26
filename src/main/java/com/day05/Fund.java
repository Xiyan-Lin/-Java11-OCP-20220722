package com.day05;

// 募款基金
public class Fund {
    // 帳戶餘額
    private Integer balance = 0;
    
    // 自行先建立好捐款帳戶物件
    private static Fund fund = new Fund();
    
    private Fund() {
    }
    
    public static Fund getFund() {
        return fund;
    }
    
    // 捐款
    public void donate(Integer amount) {
        balance += amount;
    }
    
    // 列印
    public void print() {
        System.out.printf("Fund balance: %,d\n", balance);
    }
    
}
