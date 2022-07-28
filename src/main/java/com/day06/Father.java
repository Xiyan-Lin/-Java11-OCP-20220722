package com.day06;

public class Father {
    private int balance; // 銀行帳戶餘額
    public Father() {
        this.balance = 100_0000;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void printTitle() { // 取得職銜
        System.out.println("ABC 股份有限公司總經理");
    }
}
