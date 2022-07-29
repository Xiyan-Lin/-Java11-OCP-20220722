package com.day10;

public class Tank extends Car implements Weapon {
    
    public Tank(String name) {
        setName(name);
    }
    
    @Override
    public void move() {
        System.out.printf("%s 是用履帶走的\n", getName());
    }

    @Override
    public void shoot() {
        System.out.printf("%s 發射榴炮\n", getName());
    }
    
}
