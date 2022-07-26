package com.day05;

import java.util.ArrayList; // 動態陣列宣告

public class AccountSystem {
    
    // 建立動態陣列實體
    private ArrayList<Account> accounts = new ArrayList<>();
    
    // 1. 建立帳戶
    public void addAccount(Integer amount) {
        Account account = new Account(amount);
        accounts.add(account);
    }
    
    // 2. 指定帳戶存款
    public void deposit(int index, Integer amount) {
        accounts.get(index).deposit(amount);
    }
    
    // 3. 指定帳戶提款
    public void withdraw(int index, Integer amount) {
        accounts.get(index).withdraw(amount);
    }
    
    // 4. 指定轉帳
    public void transfer(Integer amount, int fromIndex, int toIndex) {
        Account from = accounts.get(fromIndex);
        Account to = accounts.get(toIndex);
        from.transfer(amount, to);
    }
    
    // 5. 指定帳戶看餘額
    public void printAccount(int index) {
        accounts.get(index).print();
    }
    
    // 6. 查看所有帳戶餘額
    public void printAllAccounts() {
        /*
        for(Account account : accounts) {
            account.print();
        }
        */
        //accounts.forEach(account -> account.print());
        accounts.forEach(Account::print);
    }
    
    
}
