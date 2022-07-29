package com.day09;

public class Shiba implements Dog {
    private String name;
    
    public Shiba() {
        name = "柴犬";
    }
    
    @Override
    public void play() {
        System.out.printf("%s 喜歡玩飛盤\n", name);
    }

    @Override
    public void eat() {
        System.out.println("吃狗食");
    }
    
}
