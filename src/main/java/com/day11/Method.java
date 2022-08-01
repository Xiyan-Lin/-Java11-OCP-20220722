package com.day11;

// 外部類別
public class Method {
    // 方法
    public void print() {
        // 區域變數
        int x = 100; // Java 8 時若此變數要給方法內部類別使用, 則 x 就會自動加上 final (x 之後也不得再變更內容)
                     // Java 7 時若此變數要給方法內部類別使用, 則 x 就必須手動加上 final, 例如: final int x = 100;
        // 方法內部類別
        class MethodInner {
            public void callMe() {
                System.out.println("方法內部類別-callMe()");
                System.out.println("x=" + x);
            }
        }
        MethodInner mi = new MethodInner();
        mi.callMe();
    }
    
}
