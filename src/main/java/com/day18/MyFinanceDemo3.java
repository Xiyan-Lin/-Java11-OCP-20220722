package com.day18;

import java.io.IOException;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class MyFinanceDemo3 {

    public static void main(String[] args) {
        try {
            // 連續查多組商品
            find("2330.TW");
        } catch (IOException ex) {
            System.out.println("錯誤訊息: " + ex);
        }
    }

    public static void find(String symbol) throws IOException {
        Stock stock = YahooFinance.get(symbol);
        if (stock == null) {
            System.out.println("無此商品");
            return;
        }
        double price = stock.getQuote().getPrice().doubleValue();
        String time = stock.getQuote().getLastTradeTime().getTime().toString();
        System.out.printf("商品代號: %s ", symbol);
        System.out.printf("目前價格: %.3f ", price);
        System.out.printf("交易時間: %s\n", time);
    }

}
