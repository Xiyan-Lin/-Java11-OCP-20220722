package test.day11;

import com.day11.USCurrency;

public class USCurrencyTest {
    public static void main(String[] args) {
        // 1美分: PENNY 
        USCurrency usCurrency = new USCurrency(1);
        System.out.println(usCurrency.getValue());
        // 五美分: NICKLE
        USCurrency usCurrency2 = new USCurrency(5);
        System.out.println(usCurrency2.getValue());
        
        // 沒有 45 美分這種定義
        USCurrency usCurrency3 = new USCurrency(45);
        System.out.println(usCurrency3.getValue());
        
    }
}
