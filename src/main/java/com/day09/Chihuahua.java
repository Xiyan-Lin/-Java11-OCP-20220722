package com.day09;

public class Chihuahua extends ADog {
    private String name;
    
    public Chihuahua() {
        name= "吉娃娃";
    }
    
    @Override
    public void play() {
        System.out.printf("%s 很會叫\n", name);
    }

}
