package com.day08;

public class Bird extends Animal {

    public Bird() {
        super("鳥");
    }

    @Override
    public void move() {
        System.out.printf("%s 會飛\n", getName());
    }
    
}
