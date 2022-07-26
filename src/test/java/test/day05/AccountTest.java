package test.day05;

import com.day05.Account;

public class AccountTest {
    public static void main(String[] args) {
        Account act1 = new Account();
        act1.setBalance(10000);
        act1.setBalance(-60000);
        System.out.printf("balance: $%,d\n", act1.getBalance());
        
        Account act2 = new Account(20000);
        act2.deposit(5000);
        act2.withdraw(15000);
        System.out.printf("balance: $%,d\n", act2.getBalance());
        
    }
}
