package com.day05;

// 銀行帳戶
public class Account {
    private Integer balance;
    
    public Account() {
    
    }
    
    public Account(Integer balance) {
        if(balance >= 0) {
            this.balance = balance;
        }
    }
    
    public void setBalance(Integer balance) {
        if(balance >= 0) {
            this.balance = balance;
        }
    }
    
    public Integer getBalance() {
        return this.balance;
    }
}
