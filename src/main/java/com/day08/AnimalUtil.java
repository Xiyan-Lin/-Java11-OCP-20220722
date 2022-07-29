package com.day08;

// Animal 相關工具

import java.util.Random;

public class AnimalUtil {
    
    public static void print(Animal animal) {
        System.out.printf("動物名稱: %s\n", animal.getName());
    }
    
    // 隨機挑一個動物
    public static Animal getAnimal() {
        Random random = new Random();
        int n = random.nextInt(4); // 0~3
        Animal animal = null;
        switch (n) {
            case 0:
                animal = new Tiger();
                break;
            case 1:
                animal = new Fish();
                break;
            case 2:
                animal = new Ostrich();
                break;
            case 3:
                animal = new Penguin();
                break;
            
        }
        return animal;
    }
    
}
