package test.day05;

import com.day05.AccountSystem;

public class AccountSystemTest {
    public static void main(String[] args) {
        AccountSystem system = new AccountSystem();
        system.addAccount(10000);
        system.addAccount(5000);
        system.addAccount(7000);
        
        system.deposit(1, 3000);
        
        system.withdraw(2, 2000);
        
        system.transfer(1000, 0, 2);
        
        //system.printAccount(0);
        
        system.printAllAccounts();
    }
}
