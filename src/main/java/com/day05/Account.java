package com.day05;

// 銀行帳戶
public class Account {
    private Integer balance;
    
    public Account() {
    
    }
    
    public Account(Integer balance) {
        setBalance(balance);
    }
    
    public void setBalance(Integer balance) {
        if(balance >= 0) {
            this.balance = balance;
        }
    }
    
    // 存款
    public void deposit(Integer amount) {
        if(amount > 0) {
            this.balance += amount;
        }
    }
    
    // 提款
    public void withdraw(Integer amount) {
        if(amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        }
    }
    
    public Integer getBalance() {
        return this.balance;
    }
}
