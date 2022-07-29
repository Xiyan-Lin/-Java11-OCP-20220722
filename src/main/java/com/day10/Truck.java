package com.day10;

public class Truck extends Car {
    
    public Truck(String name) {
        setName(name);
    }
    
    @Override
    public void move() {
        System.out.printf("%s 是用輪子走的\n", getName());
    }
    
}
