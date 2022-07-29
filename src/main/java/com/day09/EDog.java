package com.day09;

public class EDog implements Dog {
    private String name;
    public EDog() {
        name = "電子狗";
    }
    @Override
    public void play() {
        System.out.printf("%s 會玩遊戲\n", name);
    }

    @Override
    public void eat() {
        System.out.println("吃電");
    }
    
}
