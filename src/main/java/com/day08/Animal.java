package com.day08;

public class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
    
    public void move() {
        System.out.printf("%s 會動\n", name);
        //System.out.printf("%s 會動\n", getName());
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + '}';
    }
    
}
