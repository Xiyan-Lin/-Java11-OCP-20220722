package com.day04;

// 紀錄身高,體重與BMI
public class Person {
    public Double height;
    public Double weight;
    public Double bmi;
    
    public void print() {
        System.out.printf("Person height: %.1f, weight: %.1f, bmi: %.2f\n", height, weight, bmi);
    }
}
