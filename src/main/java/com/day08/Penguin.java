package com.day08;

public class Penguin extends Bird {

    public Penguin() {
        setName("企鵝");
    }
    
    public void skill() {
        System.out.println("獵殺小魚");
    }
    
    @Override
    public void move() {
        System.out.printf("%s 不會飛但很會游\n", getName());
    }
    
}
