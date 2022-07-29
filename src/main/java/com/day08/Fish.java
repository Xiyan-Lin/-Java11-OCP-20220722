package com.day08;

public class Fish extends Animal {

    public Fish() {
        super("魚");
    }
    
    @Override
    public void move() {
        System.out.printf("%s 會游泳\n", getName());
    }

    
}
