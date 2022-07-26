package com.day05;

public class Student {
    String name; // 學生姓名
    // 自行撰寫的建構子目的, 可以初始化物件屬性值
    public Student() {
        System.out.println("Student 建構子");
    }
    public Student(String name) {
        System.out.println("Student 建構子2: " + name);
        this.name = name;
    }
    public void print() {
        System.out.printf("Student name: %s\n", name);
    }
}
