package com.day05;

public class BMI {
    String name;    // 姓名
    Double height;  // 身高(cm)
    Double weight;  // 體重(kg)
    Double value;   // 計算結果
    String result;  // 診斷訊息(正常,過重,過輕)
    
    public void print() {
        System.out.printf("BMI 姓名: %s 身高: %.1f 體重: %.1f BMI值: %.2f 診斷: %s\n", 
                          name, height, weight, value, result);
    }
}
