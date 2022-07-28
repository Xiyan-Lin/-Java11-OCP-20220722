package com.day06;

public class Son extends Father {
    @Override // 覆寫
    public void printTitle() { // 取得職銜
        System.out.println("ABC 股份有限公司 Java 工程師");
    }
}
