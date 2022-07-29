package com.day09;

public class Chihuahua implements Dog {
    private String name;
    
    public Chihuahua() {
        name= "吉娃娃";
    }
    
    @Override
    public void play() {
        System.out.printf("%s 很會叫\n", name);
    }

    @Override
    public void eat() {
        System.out.println("吃狗食");
    }
    
}
