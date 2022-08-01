package com.day11;

// 外部類別
public class Method {
    // 方法
    public void print() {
        // 方法內部類別
        class MethodInner {
            public void callMe() {
                System.out.println("方法內部類別-callMe()");
            }
        }
        MethodInner mi = new MethodInner();
        mi.callMe();
    }
}
