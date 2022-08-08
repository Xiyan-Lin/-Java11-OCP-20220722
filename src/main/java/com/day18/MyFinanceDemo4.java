package com.day18;

import java.io.IOException;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class MyFinanceDemo4 {

    public static void main(String[] args) {
        try {
            // 連續查多組商品
            find("2330.TW");
        } catch (IOException ex) {
            System.out.println("錯誤訊息: " + ex);
        } catch (Exception e) {
            System.out.println("錯誤訊息: " + e);
            System.out.println("錯誤文字內容: " + e.getMessage());
        }
    }

    public static void find(String symbol) throws IOException, Exception {
        Stock stock = YahooFinance.get(symbol);
        if (stock == null) {
            Exception ex = new Exception("無此商品");
            throw ex; //  拋出一個 Exception 物件
        }
        double price = stock.getQuote().getPrice().doubleValue();
        String time = stock.getQuote().getLastTradeTime().getTime().toString();
        System.out.printf("商品代號: %s ", symbol);
        System.out.printf("目前價格: %.3f ", price);
        System.out.printf("交易時間: %s\n", time);
    }

}
