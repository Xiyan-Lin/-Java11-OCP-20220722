package test.day05;

import com.day05.Account;

public class AccountTest {
    public static void main(String[] args) {
        Account act1 = new Account();
        act1.setBalance(10000);
        act1.setBalance(-60000);
        System.out.printf("balance: $%,d\n", act1.getBalance());
    }
}
