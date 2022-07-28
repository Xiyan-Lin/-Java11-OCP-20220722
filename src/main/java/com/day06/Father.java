package com.day06;

public class Father {
    private int balance; // 銀行帳戶餘額
    public Father(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void getTitle() { // 取得職銜
        System.out.println("ABC 股份有限公司總經理");
    }
}
