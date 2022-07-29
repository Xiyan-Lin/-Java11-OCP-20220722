package com.day10;

public abstract class Airplane {
    private String name;
    
    public abstract void speed(); // 自定義抽象方法
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
