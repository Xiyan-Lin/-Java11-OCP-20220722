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
    
    // 轉帳
    // amount: 轉帳金額
    // to: 轉帳帳戶對象
    public void transfer(Integer amount, Account to) {
        if(amount <= this.balance) {
            // 轉帳就是我提款,對方存款
            withdraw(amount); // this.withdraw(amount);
            to.deposit(amount);
        }
    }
    
    public Integer getBalance() {
        return this.balance;
    }
}
