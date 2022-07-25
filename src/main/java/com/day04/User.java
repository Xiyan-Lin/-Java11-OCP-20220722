package com.day04;

public class User {
    public String name; // 姓名(物件變數/欄位)
    public Integer age; // 年齡(物件變數/欄位)
    
    public void print() { // 提供一個列印資料的方法
        System.out.printf("user name: %s, age: %d\n", name, age);
    }
}
