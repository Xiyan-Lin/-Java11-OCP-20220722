package com.day18;

import java.io.IOException;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class MyFinanceDemo1 {
    public static void main(String[] args) {
        try {
            Stock stock = YahooFinance.get("2330.TW");
            if(stock == null) {
                System.out.println("無此商品");
                return;
            }
            String symbol = stock.getSymbol(); // 商品代號
            String name = stock.getName(); // 商品名稱/公司名稱
            double price = stock.getQuote().getPrice().doubleValue(); // 目前價格
            double change = stock.getQuote().getChange().doubleValue(); // 目前漲跌
            double changeInPercent = stock.getQuote().getChangeInPercent().doubleValue(); // 目前漲跌幅
            String tradeTimeStr = stock.getQuote().getLastTradeTime().getTime().toString(); // 最後交易時間(字串格式呈現)
            System.out.printf("商品代號: %s\n", symbol);
            System.out.printf("商品名稱: %s\n", name);
            System.out.printf("目前價格: %.2f\n", price);
            System.out.printf("目前漲跌: %.2f\n", change);
            System.out.printf("漲跌幅: %.2f%%\n", changeInPercent);
            System.out.printf("交易時間: %s\n", tradeTimeStr);
        } catch (IOException ex) {
            System.out.println("錯誤訊息:" + ex);
            System.out.println("連線到 Yahoo Finance 失敗!");
        }
        
    }
}
