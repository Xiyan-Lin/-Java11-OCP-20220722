package com.day09;

public class Shiba extends ADog {
    private String name;
    
    public Shiba() {
        name = "柴犬";
    }
    
    @Override
    public void play() {
        System.out.printf("%s 喜歡玩飛盤\n", name);
    }
    
}
