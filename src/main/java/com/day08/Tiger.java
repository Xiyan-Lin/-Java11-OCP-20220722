package com.day08;

public class Tiger extends Animal {

    public Tiger() {
        super("老虎");
    }
    
    @Override
    public void move() {
        System.out.printf("%s 很會跑\n", getName());
    }
    
}
