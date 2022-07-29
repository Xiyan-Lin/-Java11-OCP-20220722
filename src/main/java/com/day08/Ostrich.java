package com.day08;

public class Ostrich extends Bird {

    public Ostrich() {
        setName("鴕鳥");
    }
    
    public void action() {
        System.out.println("鴕鳥精神~");
    }
    
    @Override
    public void move() {
        System.out.printf("%s 不會飛但很會跑\n", getName());
    }

    
}
