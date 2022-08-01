package com.design_pattern.builder;

public class Car {
    private Integer wheel;
    private Integer door;
    private Integer cc;
    private String color;

    public Car(Integer wheel, Integer door, Integer cc, String color) {
        this.wheel = wheel;
        this.door = door;
        this.cc = cc;
        this.color = color;
    }

    public Integer getWheel() {
        return wheel;
    }

    public void setWheel(Integer wheel) {
        this.wheel = wheel;
    }

    public Integer getDoor() {
        return door;
    }

    public void setDoor(Integer door) {
        this.door = door;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" + "wheel=" + wheel + ", door=" + door + ", cc=" + cc + ", color=" + color + '}';
    }
    
    
    
}
