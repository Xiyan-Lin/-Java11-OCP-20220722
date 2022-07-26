package test.day05;

import com.day05.Account;

public class AccountTest2 {
    public static void main(String[] args) {
        Account act1 = new Account(10000);
        Account act2 = new Account(10000);
        // act1 轉 4000 給 act2
        act1.transfer(4000, act2);
        act1.print();
        act2.print();
    }
}
