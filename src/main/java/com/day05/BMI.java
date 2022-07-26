package com.day05;

public class BMI {
    String name;    // 姓名
    Double height;  // 身高(cm)
    Double weight;  // 體重(kg)
    Double value;   // 計算結果
    String result;  // 診斷訊息(正常,過重,過輕)
    
    // 建構子
    public BMI(String name, Double height, Double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        // 計算 BMI
        calcValue();
        // 診斷訊息
        setResult();
    }
    
    // 計算 BMI 值 (private 表示僅在該物件的內部使用)
    private void calcValue() {
        // 計算 BMI
        this.value = weight / Math.pow(height/100, 2);
    }
    
    // 診斷訊息
    private void setResult() {
        // 診斷訊息
        if(this.value > 23) {
            this.result = "過重";
        } else if(this.value <= 18) {
            this.result = "過輕";
        } else {
            this.result = "正常";
        }
    }
    
    public void print() {
        System.out.printf("BMI 姓名: %s 身高: %.1f 體重: %.1f BMI值: %.2f 診斷: %s\n", 
                          name, height, weight, value, result);
    }
}
