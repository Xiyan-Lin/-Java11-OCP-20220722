package com.day20;

public class Cookies {
    
    private boolean empty = true; // 預設盤子是空的
    
    public synchronized void eat(int n) {
        if(empty) { // 若盤子為空
            try {
                wait(); // 進入等待
            } catch (InterruptedException e) {
            }
        }
        System.out.printf("小狗吃了第 %d 片餅乾\n", n);
        empty = true; // 將盤子設定為空
        notify(); // 喚醒正在等待的執行緒
    }
    
    public synchronized void put(int n) {
        if(!empty) { // 若盤子非空
            try {
                wait(); // 進入等待
            } catch (InterruptedException e) {
            }
        }
        System.out.printf("主人放了第 %d 片餅乾\n", n);
        empty = false; // 將盤子設定為非空
        notify(); // 喚醒正在等待的執行緒
    }
}
