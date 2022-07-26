package test.day05;

import com.day05.AccountSystem;

public class AccountSystemTest {
    public static void main(String[] args) {
        AccountSystem system = new AccountSystem();
        system.addAccount(10000);
        system.addAccount(5000);
        system.addAccount(7000);
        
        system.deposit(1, 3000);
        
        //system.printAccount(0);
        
        system.printAllAccounts();
    }
}
