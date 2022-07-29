package com.day10;

public class Fighter extends Airplane implements Weapon {
    
    public Fighter(String name) {
        setName(name);
    }
    
    @Override
    public void speed() {
        System.out.printf("%s 1500km/h\n", getName());
    }

    @Override
    public void shoot() {
        System.out.printf("%s 發射響尾蛇飛彈\n", getName());
    }
    
}
