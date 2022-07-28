package test.day05;

import com.day05.Fund;

public class FundTest {
    public static void main(String[] args) {
        int x = 100;
        Fund fund = Fund.getFund();
        fund.donate(1000);
        
        Fund fund2 = Fund.getFund();
        fund2.donate(5000);
        
        Fund fund3 = Fund.getFund();
        fund3.donate(7000);
        
        fund.print();
        fund2.print();
        fund3.print();
    }
}
